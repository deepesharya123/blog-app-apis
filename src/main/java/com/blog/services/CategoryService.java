package com.blog.services;

import com.blog.payloads.CategoryDto;
import java.util.*;

public interface CategoryService {
//	create
	public CategoryDto createCategory(CategoryDto categorDto);
	
//	update
	public CategoryDto updateCategory(CategoryDto categoryDto,Integer id);
	
//	delete
	public void deleteCategory(Integer categoryId);
	
//	get
	public CategoryDto getCategory(Integer categoryId);
	
	
//	getsingle
	public List<CategoryDto> getCategories();
	
	
	
}
