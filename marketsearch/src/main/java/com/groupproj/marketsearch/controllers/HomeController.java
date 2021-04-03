package com.groupproj.marketsearch.controllers;

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
	@PostMapping("/marketsearch/search")
	public String searchproduct(@RequestParam("barcode") String barcode, Model viewModel) {
//		this.pService.getAllProducts(barcode);
		return "redirect:/marketsearch/searchresult/"+barcode;
	}
	
	@GetMapping("/marketsearch/searchresult/{barcodeinput}")
	public String searchresult(@PathVariable("barcodeinput")String barcode,  Model viewModel) {
		// access the search
		Product results = pService.getAllProducts(barcode);
		viewModel.addAttribute("results", results);
//		System.out.println("results="+results.getTitle());
		return "searchresult.jsp";
	}
	//Mapping for adding to wishlist
	@GetMapping("/marketsearch/wish/{barcode}")
	public String wish(@PathVariable("barcode")String barcode, HttpSession session) {
		Long userId = (Long)session.getAttribute("user_id");
		User currentUser = this.uService.getById(userId);
		//Intitialize DBProduct object
		Product results = pService.getAllProducts(barcode);
		String title = this.pService.getTitleBP(results);
		Double baseprice = this.pService.getBasePriceBP(results);
		Double bestprice = this.pService.getBestPriceBP(results);
		DBProduct prodToWish = this.dbpService.createEntry(title, baseprice, bestprice, barcode);
		//Wish it
		this.dbpService.wish(prodToWish, currentUser);
		return "redirect:/marketsearch/searchresult/"+barcode;
	}
	//Mapping for removing from wishlist
	@GetMapping("/marketsearch/unwish/{barcode}/{id}")
	public String unWish(@PathVariable("barcode")String barcode, @PathVariable("id")Long prodId, HttpSession session) {
		Long userId = (Long)session.getAttribute("user_id");
		User currentUser = this.uService.getById(userId);
		//Get the DBProduct to Unlike
		//At this point there is a product object in the DB. How we get the id for the product is up to Front End. Possible ideas: form with hidden input/two path variables/Once added to wishlist can unly unwish from actual wishlist.jsp might be the simplest. Here i used double path variable just to avoid errors on page.
		DBProduct prodToUnWish = this.dbpService.getById(prodId);
		//UnWish
		this.dbpService.unWish(prodToUnWish, currentUser);
		return "redirect:/marketsearch/searchresult/"+barcode;
	}
}
