package com.cd.casestudy.serviceImp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.cd.casestudy.converter.AlbumConverter;
import com.cd.casestudy.converter.CategoryConverter;
import com.cd.casestudy.dto.CategoryDTO;
import com.cd.casestudy.model.Category;
import com.cd.casestudy.repository.AlbumRepository;
import com.cd.casestudy.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	CategoryConverter categoryConverter;
	  
	@Autowired
	AlbumConverter albumConvertor;
	
	@Autowired
	AlbumRepository albumRepository;
	
	//getting all the category
	public List<CategoryDTO> getAllCategory() {
		
		List<Category> category = (List<Category>) categoryRepository.findAll();
		return categoryConverter.entityToDto(category);
	}
	
	//Add new category 
	public Category newCategory(@RequestBody CategoryDTO category)
	{
		Category newCategory = categoryConverter.dtoToEntity(category);
		return categoryRepository.save(newCategory);
	}
	
	//Add category with album
	public String categoryAlbum(@RequestBody CategoryDTO categoryDto)
	{
		Category category =categoryConverter.dtoToEntity(categoryDto);
		categoryRepository.save(category);
		//List<Album> al = albumConvertor.dtoToEntity(categoryDto.getalbumList());
		return "Inserted Successfully";
	}
}
