package com.groupproj.marketsearch.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupproj.marketsearch.models.DBProduct;
import com.groupproj.marketsearch.repositories.DBProductRepo;
@Service
public class DBProductService {
	@Autowired
	private DBProductRepo dbpRepo;
	
	//Create Product from bean constructor
	public DBProduct createEntry(DBProduct input) {
		return this.dbpRepo.save(input);
	}
	//Create Product from overloaded constructor
	public DBProduct createEntry(String title, Double basePrice, Double bestPrice, String barcode) {
		DBProduct newEntry = new DBProduct(title, basePrice, bestPrice, barcode);
		return this.dbpRepo.save(newEntry);
	}
	public List<DBProduct> getAll(){
		return this.dbpRepo.findAll();
	}
	public DBProduct getById(Long id) {
		return this.dbpRepo.findById(id).orElse(null);
	}
	//Get a single DBProduct by barcode
	public DBProduct getDBProdByBarcode(String barcode) {
		DBProduct product= this.dbpRepo.findDBProductBybarcode(barcode);
		return product;
	}
	public void deleteById(Long id) {
		this.dbpRepo.deleteById(id);
	}
	
}
