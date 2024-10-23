package com.blog_app.service;

import java.util.List;

import com.blog_app.payload.CategoryDto;

public interface CategoryService {
	
	//create
	
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	//delete
	void deleteCategory(Integer categoryId);
	//get
	CategoryDto getCategory(Integer categoryId);
	
	//getall
	
	List<CategoryDto> getAllCategory();

}
