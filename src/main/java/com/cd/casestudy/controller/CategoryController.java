package com.cd.casestudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cd.casestudy.model.CategoryAlbum;
import com.cd.casestudy.repository.CategoryRepository;
import com.cd.casestudy.serviceImp.CategoryService;

@RestController
@RequestMapping("/api/")

public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	// get all category
	@GetMapping("/category")
	public List getAllCategory()
	{
		return categoryService.getAllCategory();
	}
	
	//save the new category
	@PostMapping("/new-category")
	public void newCategory(CategoryAlbum categoryAlbum)
	{
		categoryService.newCategory(categoryAlbum);
	}
	
}
