package com.cd.casestudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cd.casestudy.dto.CategoryDTO;
import com.cd.casestudy.model.Category;
import com.cd.casestudy.serviceImp.CategoryService;

@RestController
@RequestMapping("/api/")

public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	// get all category -- working
	@GetMapping("/category")
	public List<CategoryDTO> getAllCategory()
	{
		return categoryService.getAllCategory();
	}
	
	//save the new category
	@PostMapping("/new-category")
	public Category newCategory(@RequestBody CategoryDTO dto)
	{
		return categoryService.newCategory(dto);
	}
	
	@PostMapping("/category-with-album")
	public String CategoryWithAlbum(@RequestBody CategoryDTO dto)
	{
		
		return categoryService.categoryAlbum(dto);
	}
}
