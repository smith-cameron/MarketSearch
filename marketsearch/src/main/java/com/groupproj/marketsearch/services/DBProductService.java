package com.groupproj.marketsearch.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.groupproj.marketsearch.models.DBProduct;
import com.groupproj.marketsearch.models.User;
import com.groupproj.marketsearch.repositories.DBProductRepo;

public class DBProductService {
	@Autowired
	private DBProductRepo dbpRepo;
	
	//Create Product object to save to wishlist
		public DBProduct createEntry(String title, Double basePrice, Double bestPrice, String barcode) {
			DBProduct newEntry = new DBProduct(title, basePrice, bestPrice, barcode);
			return this.dbpRepo.save(newEntry);
		}
		//Add to wishlist
		public void wish(DBProduct product, User user) {
			List<User> prodDesired = product.getUsersWhoWant();
			prodDesired.add(user);
			this.dbpRepo.save(product);
		}
		//Remove from wishlist
		public void unWish(DBProduct product, User user) {
			List<User> prodDesired = product.getUsersWhoWant();
			prodDesired.remove(user);
			this.dbpRepo.save(product);
		}
}
