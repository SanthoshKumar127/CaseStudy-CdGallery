package com.cd.casestudy.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cd.casestudy.dto.CategoryDTO;
import com.cd.casestudy.model.Category;

@Component
public class CategoryConverter {

	public CategoryDTO entityToDto(Category category)
	{
		CategoryDTO dto = new CategoryDTO();
		
		dto.setCategoryId(category.getCategoryId());
		dto.setCategoryName(category.getCategoryName());
		dto.setCategoryDescription(category.getCategoryDescription());
	
		return dto;
	}
	
	public List<CategoryDTO> entityToDto(List<Category> category)
	{
		return category.stream().map(x-> entityToDto(x)).collect(Collectors.toList());
	}
	
	public Category dtoToEntity(CategoryDTO dto)
	{
		Category category = new Category();
		
		category.setCategoryId(dto.getCategoryId());
		category.setCategoryName(dto.getCategoryName());
		category.setCategoryDescription(dto.getCategoryDescription());
		
		return category;
	}
}
