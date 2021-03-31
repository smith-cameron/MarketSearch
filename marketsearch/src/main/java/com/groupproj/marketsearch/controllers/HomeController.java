package com.groupproj.marketsearch.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.groupproj.marketsearch.models.Product;
import com.groupproj.marketsearch.models.User;
import com.groupproj.marketsearch.services.ProductService;
import com.groupproj.marketsearch.services.UserService;

@Controller
@RequestMapping("/marketsearch")
public class HomeController {
	@Autowired
	private ProductService pService;
	@Autowired
	private UserService uService;
	@GetMapping("")
	public String index() {
	
		return "landing.jsp";
	}
	
	@GetMapping("/search")
	public String seachMP(Model viewModel) {

		return "search.jsp";
	}
	@PostMapping("/search")
	public String seachproduct(@RequestParam("barcode") String barcode, Model viewModel) {
		System.out.println(barcode);
		this.pService.getAllProducts(barcode);
		String barcodeinput  =barcode;
		
		return "redirect:/marketsearch/searchresult/"+barcodeinput;
	}
	
	@GetMapping("/searchresult/{barcodeinput}")
	public String seachresult(@PathVariable("barcodeinput")String barcode,  Model viewModel) {
		// access the search
		Product results= pService.getAllProducts(barcode);
		viewModel.addAttribute("results", results);
		System.out.println("results="+results.getTitle());
		return "searchresult.jsp";
	}
	//Mapping for adding to wishlist
	@GetMapping("wish/{barcode}")
	public String wish(@PathVariable("barcode")String barcode, HttpSession session) {
		Long userId = (Long)session.getAttribute("user_id");
		User currentUser = this.uService.getById(userId);
		return "redirect:/marketsearch/searchresult/"+barcode;
	}
	//Mapping for removing from wishlist
	@GetMapping("unwish/{barcode}")
	public String unWish(@PathVariable("barcode")String barcode) {
	
		return "redirect:/marketsearch/searchresult/"+barcode;
	}
}
