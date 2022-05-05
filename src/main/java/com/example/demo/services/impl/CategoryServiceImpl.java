package com.example.demo.services.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	

	@Override
	public Category addCategory(Category c) {
		 
		return this.categoryRepository.save(c);
		
	}

	@Override
	public Category updateCategory(Category c) {
		return this.categoryRepository.save(c);
		
	}

	@Override
	public Set<Category> getCategories() {
		return new LinkedHashSet<>(this.categoryRepository.findAll());
	}

	@Override
	public Category getCategoryById(Long id) {
		return this.categoryRepository.getById(id);
		
	}

	@Override
	public void deleteCategory(Long id) {
		this.categoryRepository.deleteById(id);
	}

}
