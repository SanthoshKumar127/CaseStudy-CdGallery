package com.cd.casestudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cd.casestudy.model.CategoryAlbum;
import com.cd.casestudy.repository.CategoryRepository;

@RestController
@RequestMapping("/api/")
public class CategoryController {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	//Get the category details
	@GetMapping("/category")
	public List<CategoryAlbum> getCategoryAlbum() {
		return categoryRepository.findAll();
	}
}
