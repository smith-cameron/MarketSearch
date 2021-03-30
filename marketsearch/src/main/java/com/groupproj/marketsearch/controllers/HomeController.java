package com.groupproj.marketsearch.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.groupproj.marketsearch.models.Product;
import com.groupproj.marketsearch.services.ProductService;

@Controller
@RequestMapping("/marketsearch")
public class HomeController {
	@Autowired
	private ProductService pService;
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
	


}
