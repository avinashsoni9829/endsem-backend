package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	 // this findBy can be followed by anything as per the entity we have created 
	 public User findByUsername(String username);
	 

}
