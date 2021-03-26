package com.groupproj.marketsearch.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.groupproj.marketsearch.models.User;

public interface UserRepo extends CrudRepository<User, Long>{
	List<User> findAll();
	boolean existsByEmail(String email);
	User findByEmail(String email);

}
