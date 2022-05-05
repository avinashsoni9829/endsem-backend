package com.example.demo.services;

import java.util.Set;

import com.example.demo.entity.Category;

public interface CategoryService {
     public Category addCategory(Category c);
     public Category updateCategory(Category c);
     public Set<Category> getCategories();
     public Category getCategoryById(Long id);
     public void deleteCategory(Long id);
     
     
}
