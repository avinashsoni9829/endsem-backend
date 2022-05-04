package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import com.example.demo.services.UserService;

@SpringBootApplication
public class EndsemBackendApplication implements CommandLineRunner {
    @Autowired
	private UserService userService;
	
    
    public static void main(String[] args) {
		SpringApplication.run(EndsemBackendApplication.class, args);
	}

	@Override 
	public void run(String... args) throws Exception {
		System.out.println("Starting code");
		
		
		
		
	}

}
