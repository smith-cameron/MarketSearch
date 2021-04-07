package com.groupproj.marketsearch.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.groupproj.marketsearch.models.EbayProduct;
import com.groupproj.marketsearch.services.eBayProductServices;
@Controller
public class eBayController {
	
	@Autowired
	private eBayProductServices eService ;
	
	@GetMapping("/marketsearch/ebay")
	public String landing() {
		return "eBaylanding.jsp";
	}
	
	@GetMapping("/marketsearch/ebay/search")
	public String searchMP(Model viewModel) {
		return "eBaysearch.jsp";
	}
	//search mapping for casual user
	@PostMapping("/marketsearch/ebay/search")
	public String searchproduct(@RequestParam("keyword") String keyword, Model viewModel) {
		return "redirect:/marketsearch/ebay/searchresult/"+keyword;
	}
	
	@GetMapping("/marketsearch/ebay/searchresult/{keyword}")
	public String searchresult(@PathVariable("keyword")String keyword,  Model viewModel) {
		// access the search
		ArrayList<EbayProduct> results = eService.getAllProducts(keyword);
		//EbayProduct results = eService.getTop10Products(keyword);
	   // System.out.println("+++eServerice.getallproducts= "+eService.getAllProducts(keyword));
		viewModel.addAttribute("results", results);
		System.out.println("---result line 41 = "+results);
		//System.out.println("***result line 42 = "+results.getFindItemsByKeywordsResponse());
		return "eBaysearchresult.jsp";
	}

}
