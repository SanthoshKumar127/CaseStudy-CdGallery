package com.cd.casestudy.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cd.casestudy.model.CategoryAlbum;
import com.cd.casestudy.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	//getting all the category
	public List getAllCategory() {
		return categoryRepository.findAll();
	}
	
	
	//Add new category 
	public void newCategory(CategoryAlbum categoryAlbum)
	{
		categoryRepository.save(categoryAlbum);
	}
}
