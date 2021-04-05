package com.groupproj.marketsearch.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.groupproj.marketsearch.models.DBProduct;
import com.groupproj.marketsearch.models.Product;
import com.groupproj.marketsearch.models.User;
import com.groupproj.marketsearch.services.DBProductService;
import com.groupproj.marketsearch.services.ProductService;
import com.groupproj.marketsearch.services.UserService;

@Controller
public class HomeController {
	@Autowired
	private ProductService pService;
	@Autowired
	private UserService uService;
	@Autowired
	private DBProductService dbpService;
	
	@GetMapping("/")
	public String index() {
		return "redirect:/marketsearch";
	}
	@GetMapping("/marketsearch")
	public String landing() {
		return "landing.jsp";
	}
	
	@GetMapping("/marketsearch/search")
	public String searchMP(Model viewModel) {
		return "search.jsp";
	}
	//search mapping for casual user
	@PostMapping("/marketsearch/search")
	public String searchproduct(@RequestParam("barcode") String barcode, Model viewModel) {
		return "redirect:/marketsearch/searchresult/"+barcode;
	}
	
	@GetMapping("/marketsearch/searchresult/{barcode}")
	public String searchresult(@PathVariable("barcode")String barcode,  Model viewModel) {
		// access the search
		Product results = pService.getAllProducts(barcode);
		viewModel.addAttribute("results", results);
		return "searchresult.jsp";
	}
	//search mapping for logged in user
	@PostMapping("/marketsearch/searchFU")
	public String searchproductFU(@RequestParam("barcode") String barcode) {
		return "redirect:/marketsearch/searchresultFU/"+barcode;
	}
	
	@GetMapping("/marketsearch/searchresultFU/{barcode}")
	public String searchresultFU(@PathVariable("barcode")String barcode,  Model viewModel,HttpSession session) {
		try {
			Product results = pService.getAllProducts(barcode);
			Long userId = (Long)session.getAttribute("user_id");
			User currentUser = this.uService.getById(userId);
			List<DBProduct> usersFavs = this.uService.getUserWishlist(currentUser);
			DBProduct prodcheck = this.dbpService.getDBProdByBarcode(barcode);
			System.out.println(prodcheck.getTitle());
			viewModel.addAttribute("results", results);
			viewModel.addAttribute("barcode", barcode);
			viewModel.addAttribute("currentUser", currentUser);
			viewModel.addAttribute("usersFavs", usersFavs);
			viewModel.addAttribute("product", prodcheck);
			return "searchresultFU.jsp";
			
		} catch (Exception e) {
			System.out.println("not in db");
		}
		Product results = pService.getAllProducts(barcode);
		Long userId = (Long)session.getAttribute("user_id");
		User currentUser = this.uService.getById(userId);
		List<DBProduct> usersFavs = this.uService.getUserWishlist(currentUser);
		DBProduct prodcheck = this.dbpService.getDBProdByBarcode(barcode);
		viewModel.addAttribute("results", results);
		viewModel.addAttribute("barcode", barcode);
		viewModel.addAttribute("currentUser", currentUser);
		viewModel.addAttribute("usersFavs", usersFavs);
		viewModel.addAttribute("product", prodcheck);
		return "searchresultFU.jsp";
	}
	//Mapping for adding to wishlist
	@GetMapping("/marketsearch/wish/{barcode}")
	public String wish(@PathVariable("barcode")String barcode, HttpSession session) {
		Long userId = (Long)session.getAttribute("user_id");
		User currentUser = this.uService.getById(userId);
		List<DBProduct> allProd = this.dbpService.getAll();
		DBProduct prodcheck = this.dbpService.getDBProdByBarcode(barcode);
		if(allProd.contains(prodcheck)) {
			this.uService.wish(prodcheck, currentUser);
			return "redirect:/marketsearch/searchresultFU/"+barcode;
		}else {
		Product results = pService.getAllProducts(barcode);
		String title = this.pService.getTitleBP(results);
		Double baseprice = this.pService.getBasePriceBP(results);
		Double bestprice = this.pService.getBestPriceBP(results);
		DBProduct prodToWish = this.dbpService.createEntry(title, baseprice, bestprice, barcode);
		this.uService.wish(prodToWish, currentUser);
		return "redirect:/marketsearch/searchresultFU/"+barcode;
		}
	}
	//Mapping for removing from wishlist
	@GetMapping("/marketsearch/unwish/{barcode}")
	public String unWish(@PathVariable("barcode")String barcode, HttpSession session) {
		Long userId = (Long)session.getAttribute("user_id");
		User currentUser = this.uService.getById(userId);
		System.out.println(currentUser.getEmail());
		//Get the DBProduct to Unlike
		DBProduct prodToUnWish = this.dbpService.getDBProdByBarcode(barcode);
		System.out.println(prodToUnWish.getTitle());
		//UnWish
		this.uService.unWish(prodToUnWish, currentUser);
		return "redirect:/marketsearch/searchresultFU/"+barcode;
	}
//	@GetMapping("/marketplace/wishlist")
//	public String wishlistByUser(HttpSession session) {
//		
//	}
}
