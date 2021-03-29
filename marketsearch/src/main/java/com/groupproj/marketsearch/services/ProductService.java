package com.groupproj.marketsearch.services;

import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.groupproj.marketsearch.models.Product;



@Service
public class ProductService {

	
	// Get all product

	//public HttpResponse<String> getAllProducts() {
public Product getAllProducts(@RequestBody String barcode) {
		try {
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://ebay-com.p.rapidapi.com/products/647865100010"))
					.header("x-rapidapi-key", "5f6d2d6ce7msh94ea67f8eb9f318p1f2ddbjsnb92025009f9f")
					.header("x-rapidapi-host", "ebay-com.p.rapidapi.com")
					.method("GET", HttpRequest.BodyPublishers.noBody())
					.build();
			HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
					System.out.println(response.body()); //json object 
			// create object mapper
			ObjectMapper mapper = new ObjectMapper(); //jackson formatting
			//read Json from reponsebody and map/convert to java POJO
			//Product product =mapper.readValue(new File("data/sample.json"),Product.class);
					Product product =mapper.readValue(response.body(),Product.class);
			//dat /sample-lite.json
			System.out.println("title:= "+product.getTitle());
			System.out.println(product.getFormattedBasePrice());
			System.out.println(product.getBestPrice());
			return (product);
		
			//return (response.body());
			
			
//			HttpResponse<String> response = Unirest.get("https://ebay-com.p.rapidapi.com/products/barcode")
//					.header("x-rapidapi-key", "5f6d2d6ce7msh94ea67f8eb9f318p1f2ddbjsnb92025009f9f")
//					.header("x-rapidapi-host", "ebay-com.p.rapidapi.com")
//					.asString();
//			System.out.println(response.getStatus());
//		      System.out.println(response.getHeaders().get("Content-Type"));
//		      return response;
//			
//			AsyncHttpClient client = new DefaultAsyncHttpClient();
//			client.prepare("GET", "https://ebay-com.p.rapidapi.com/products/647865100010")
//				.setHeader("x-rapidapi-key", "5f6d2d6ce7msh94ea67f8eb9f318p1f2ddbjsnb92025009f9f")
//				.setHeader("x-rapidapi-host", "ebay-com.p.rapidapi.com")
//				.execute()
//				.toCompletableFuture()
//				.thenAccept(System.out::println)
//				.join();
//
//			client.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return (response.body().);
		System.out.println("this is out of try block");
		return null; //TODO
	}
	


//public static void main(String[] strArgs) (){
//// create object mapper
//ObjectMapper mapper = new ObjectMapper();
////read Json from reponsebody and map/convert to java POJO
//Product product =ObjectMapper.readValue(new File("data/sample.json"),Product.class);
////dat /sample-lite.json
//
////print 
//
//
//}
}
