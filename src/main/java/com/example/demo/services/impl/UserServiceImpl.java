package com.example.demo.services.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserService;

@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		
	// before creating any user we will first check if it is already in the database or not 
	 User u = this.userRepository.findByUsername(user.getUsername());
	
	// now if the user is already present then we will handle the exception 
	
	
	 if(u!=null) {
		    System.out.println("Already Exist!");
		    throw new Exception("User Already Present!");
	   }
	   else
	   {
		    // otherwise we will create a new User
		    
		   // we will first save all the roles in the db
		   for(UserRole usr:userRoles) {
			   roleRepository.save(usr.getRole());
		   }
		   // now add all the roles to the particular user
		   user.getUserRoles().addAll(userRoles);
		   
		   // now finally save the user 
		   
		   u = this.userRepository.save(user);
		   
		    
	   }
		return u;
	}

	
	
	

}
