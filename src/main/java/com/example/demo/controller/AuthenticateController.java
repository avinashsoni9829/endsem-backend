package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.JwtUtil;
import com.example.demo.entity.JwtRequest;
import com.example.demo.entity.JwtResponce;
import com.example.demo.services.impl.UserDetailsServiceImpl;

@RestController
public class AuthenticateController {
     
	 @Autowired
	 private AuthenticationManager authenticationManager;
	
	 @Autowired
	 private UserDetailsServiceImpl userDetailsService;
	 
	 @Autowired
	 private JwtUtil jwtUtils;
	 
	 @PostMapping("/generate-token")
	 public ResponseEntity<?>generateToken(@RequestBody JwtRequest jwtRequest) throws Exception{
		try 
		{
			 authenticate(jwtRequest.getUsername(), jwtRequest.getPassword());
		} 
	    catch (UsernameNotFoundException e)
		{
		    e.printStackTrace();
		    throw new Exception("User Not Found");
		}
		
		UserDetails user = userDetailsService.loadUserByUsername(jwtRequest.getUsername());
		
		String token = this.jwtUtils.generateToken(user);
		
		return ResponseEntity.ok(new JwtResponce(token));
		
	 }
	 
	 
	 
	 private void authenticate(String username , String Password) throws Exception {
		try 
		{
		 authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, Password));
		} catch (DisabledException e) {
			// TODO: handle exception
			throw new Exception("USER Disabled ");
		}
		catch(BadCredentialsException e) {
			 throw new Exception("Invalid Credentials");
		}
	 }
}
