package com.example.demo.services;

import java.util.Set;

import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;

public interface UserService {
   
	// Create a User 
	public User createUser(User user , Set<UserRole>userRoles) throws Exception;
	
	// get details of a user
	
	public User getUser(String username);
	
	
	// delete user by id
	
	public void deleteUser(long UserId);
	
	
	// user update
	
	public User updateUser(User user);
	
	
	
}
