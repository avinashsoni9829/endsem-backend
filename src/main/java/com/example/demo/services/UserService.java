package com.example.demo.services;

import java.util.Set;

import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;

public interface UserService {
   
	// Create a User 
	public User createUser(User user , Set<UserRole>userRoles) throws Exception;
	
}
