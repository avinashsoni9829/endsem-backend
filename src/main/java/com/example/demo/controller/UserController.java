package com.example.demo.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import com.example.demo.services.UserService;

// we will keep all the endpoints here 

@RestController
@RequestMapping("/user")
// in order to allow cross platform request as frontend run on another server and backend on another
@CrossOrigin("*")
public class UserController {
 
	 @Autowired
	 private UserService userService;
	 
	
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		
		Set<UserRole> roles = new HashSet<>();
		// for every new user we will give the role as Normal only 
		Role role = new Role(4L,"NORMAL");
		
		UserRole ur = new UserRole(user,role);
		
		roles.add(ur);
		
		return this.userService.createUser(user, roles);
		
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userService.getUser(username);
	}
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId) {
		this.userService.deleteUser(userId);
	}
	
	
	  
}
