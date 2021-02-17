package com.cd.casestudy.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cd.casestudy.dto.AlbumDTO;
import com.cd.casestudy.model.Album;

@Component
public class AlbumConverter {

	public AlbumDTO entityToDto(Album al)
	{
		AlbumDTO dto = new AlbumDTO();
		
		dto.setAlbumId(al.getAlbumId());
		dto.setAlbumTitle(al.getAlbumTitle());
		//dto.setCategory(album.getCategoryId());
		dto.setHirePrice(al.getHirePrice());
		dto.setNoOfCd(al.getNoOfCd());
		dto.setStatus(al.getStatus());
		return dto;
	}
	
	public List<AlbumDTO> entityToDto(List<Album> album)
	{
		return album.stream().map(al->entityToDto(al)).collect(Collectors.toList());
	}
	
	
	public AlbumDTO dtoToEntity(AlbumDTO albumDto)
	{
		AlbumDTO album = new AlbumDTO();
		
		album.setAlbumId(albumDto.getAlbumId());
		album.setAlbumTitle(albumDto.getAlbumTitle());
		//album.setCategoryId(albumDto.getCategory());// Create a method to pull the category details in service class
		album.setHirePrice(albumDto.getHirePrice());
		album.setNoOfCd(albumDto.getNoOfCd());
		album.setStatus(albumDto.getStatus());
		return album;
	}

	public List<AlbumDTO> dtoToEntity(List<AlbumDTO> album) {
		
		
		return album.stream().map(al->dtoToEntity(al)).collect(Collectors.toList());
	}
}
