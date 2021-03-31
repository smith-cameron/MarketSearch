package com.groupproj.marketsearch.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.groupproj.marketsearch.models.DBProduct;

public interface DBProductRepo extends CrudRepository<DBProduct, Long>{
	List<DBProduct> findAll();
}
