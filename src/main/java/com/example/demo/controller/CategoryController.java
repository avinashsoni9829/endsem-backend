package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Category;
import com.example.demo.services.CategoryService;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {
      
	  @Autowired
	  private CategoryService categoryService;
	  
	  
	  @PostMapping("/")
	  public ResponseEntity<?> addCategory(@RequestBody Category c){
		   Category category1 = this.categoryService.addCategory(c);
		   return ResponseEntity.ok(category1);
	  }
	  
	  @GetMapping("/{categoryId}")
	  public Category getCategory(@PathVariable("categoryId") Long categoryId){
		  return this.categoryService.getCategoryById(categoryId);
	  }
	  
	  @GetMapping("/")
	  public ResponseEntity<?> getAllCategories(){
		   return ResponseEntity.ok(this.categoryService.getCategories());
	  }
	  
	  @PutMapping("/")
	  public Category updateCategory(@RequestBody Category c) {
		   return this.categoryService.updateCategory(c);
	  }
	  
	  @DeleteMapping("/{cId}")
	  public void deleteCategory(@PathVariable("cId") Long cId){
		   this.categoryService.deleteCategory(cId);
	  }
	  
} 
