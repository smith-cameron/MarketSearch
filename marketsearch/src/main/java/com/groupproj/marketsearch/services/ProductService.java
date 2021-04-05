package com.groupproj.marketsearch.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.groupproj.marketsearch.models.Product;
import com.mashape.unirest.http.Unirest;

@Service
public class ProductService {
	
	// Get all product
	public Product getAllProducts(@RequestBody String barcode) {
		try {
			System.out.println(barcode);
			com.mashape.unirest.http.HttpResponse<String> response = Unirest
					.get("https://ebay-com.p.rapidapi.com/products/" + barcode)
					.header("x-rapidapi-key", "5f6d2d6ce7msh94ea67f8eb9f318p1f2ddbjsnb92025009f9f")
					.header("x-rapidapi-host", "ebay-com.p.rapidapi.com").asString();
			System.out.println(response.getBody());
			ObjectMapper mapper = new ObjectMapper(); // jackson formatting
			// read Json from reponsebody and map/convert to java POJO
			Product product = mapper.readValue(response.getBody(), Product.class);
			
			System.out.println("title:= " + product.getTitle());
			System.out.println(product.getFormattedBasePrice());
			System.out.println(product.getBestPrice());
			return (product);

			// return (response.body());

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("this is out of try block");
		return null; // TODO
	}
	public String getTitleBP(Product product) {
		String title = product.getTitle();
		return title;
	}
	public Double getBasePriceBP(Product product) {
		Double basePrice = product.getBasePrice();
		return basePrice;
	}
	public Double getBestPriceBP(Product product) {
		Double bestPrice = product.getBestPrice();
		return bestPrice;
	}
}