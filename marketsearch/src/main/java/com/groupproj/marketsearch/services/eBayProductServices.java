package com.groupproj.marketsearch.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.groupproj.marketsearch.models.EbayProduct;
import com.groupproj.marketsearch.models.Item;
import com.groupproj.marketsearch.models.FindItemsByKeywordsResponse;
import com.groupproj.marketsearch.models.SearchResult;
import com.groupproj.marketsearch.models.Product;
import com.mashape.unirest.http.Unirest;

@Service
public class eBayProductServices {

	// Get all product
		public EbayProduct getAllProducts(@RequestBody String keyword) {
			//public EbayProduct getTop10Products(@RequestBody String keyword) {
			try {
				System.out.println("Keyword= "+keyword);
				com.mashape.unirest.http.HttpResponse<String> response = Unirest
						.get("https://svcs.ebay.com/services/search/FindingService/v1")
						.queryString("SECURITY-APPNAME", "Makarand-QuickSea-PRD-04198d6f1-c9da80e0")
						.queryString("OPERATION-NAME", "findItemsByKeywords")
						.queryString("RESPONSE-DATA-FORMAT", "JSON")
						.queryString("keywords", keyword)
						.queryString("GLOBAL-ID", "EBAY-US")
						.asString();   //keyword=bike hardcoded
			//	System.out.println("response header= "+ response.getHeaders());
				
			//	System.out.println("response Body= "+response.getBody());
				ObjectMapper mapper = new ObjectMapper(); // jackson formatting
				// read Json from reponsebody and map/convert to java POJO
				EbayProduct ebayproduct = mapper.readValue(response.getBody(), EbayProduct.class);
				
			//System.out.println("responsebody35:= " + ebayproduct.getFindItemsByKeywordsResponse());
			//System.out.println(ebayproduct.getFormattedBasePrice());
//				System.out.println(ebayproduct.getBestPrice());
				return (ebayproduct);
//System.out.println(ebayproduct.getAdditionalProperties().get			// return (response.body());

			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			System.out.println("this is out of try block");
			return null; // TODO
		}
//		public List<String> getTitleebay(EBayProduct ebayproduct) {
//		
//			System.out.println("title52= "+title);
//			return title;
//		}
}

	
