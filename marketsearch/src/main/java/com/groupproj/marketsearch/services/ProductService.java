package com.groupproj.marketsearch.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.groupproj.marketsearch.models.Product;
import com.mashape.unirest.http.Unirest;



@Service
public class ProductService {

	
	// Get all product

	//public HttpResponse<String> getAllProducts() {
public Product getAllProducts(@RequestBody String barcode) {
		try {			
			com.mashape.unirest.http.HttpResponse<String> response = Unirest.get("https://ebay-com.p.rapidapi.com/products/647865100010")
                    .header("x-rapidapi-key", "54781b218dmsh179859cdc308473p1c3856jsn1f21f1b2e12f")
                    .header("x-rapidapi-host", "ebay-com.p.rapidapi.com")
                    .asString();
            System.out.println(response.getBody());
			ObjectMapper mapper = new ObjectMapper(); //jackson formatting
			//read Json from reponsebody and map/convert to java POJO
			//Product product =mapper.readValue(new File("data/sample.json"),Product.class);
			Product product =mapper.readValue(response.getBody(),Product.class);
			//dat /sample-lite.json
			System.out.println("title:= "+product.getTitle());
			System.out.println(product.getFormattedBasePrice());
			System.out.println(product.getBestPrice());
			return (product);
		
			//return (response.body());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return (response.body().);
		System.out.println("this is out of try block");
		return null; //TODO
	}
	
}