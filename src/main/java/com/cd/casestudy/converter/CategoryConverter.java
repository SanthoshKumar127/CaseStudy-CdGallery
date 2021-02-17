package com.cd.casestudy.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import com.cd.casestudy.dto.AlbumDTO;
import com.cd.casestudy.dto.CategoryDTO;
import com.cd.casestudy.model.Album;
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
	
	public Category dtoToEntity(CategoryDTO categoryDto)
	{
		Category category = new Category();
		
		//category.setCategoryId(categoryDto.getCategoryId());
		category.setCategoryName(categoryDto.getCategoryName());
		category.setCategoryDescription(categoryDto.getCategoryDescription());
		
		List<AlbumDTO> albumDto = categoryDto.getalbumList();
		
		List<Album> album = new ArrayList<>();
		
		for(AlbumDTO albums : albumDto)
		{
			Album al = new Album();
			al.setCategoryId(category);
			al.setAlbumTitle(albums.getAlbumTitle());
			al.setHirePrice(albums.getHirePrice());
			al.setNoOfCd(albums.getNoOfCd());
			al.setStatus(albums.getStatus());
			
			album.add(al);
		}
		category.setAlbum(album);
		
		return category;
	}
}
