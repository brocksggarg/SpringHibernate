package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	List<User> findAll();
	
	/*@Query("select * from users where Password=?1")
	List<User> findByPass(String p);*/
	

}
