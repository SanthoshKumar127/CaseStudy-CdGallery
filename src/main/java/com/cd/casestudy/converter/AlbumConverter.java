package com.cd.casestudy.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cd.casestudy.dto.AlbumDTO;
import com.cd.casestudy.model.Album;

@Component
public class AlbumConverter {

	public AlbumDTO entityToDto(Album album)
	{
		AlbumDTO dto = new AlbumDTO();
		
		dto.setAlbumId(album.getAlbumId());
		dto.setAlbumTitle(album.getAlbumTitle());
		dto.setCategory(album.getCategoryId());
		dto.setHirePrice(album.getHirePrice());
		dto.setNoOfCd(album.getNoOfCd());
		dto.setStatus(album.getStatus());
		return dto;
	}
	
	public List<AlbumDTO> entityToDto(List<Album> album)
	{
		return album.stream().map(x-> entityToDto(x)).collect(Collectors.toList());
	}
	
	public Album dtoToEntity(AlbumDTO albumDto)
	{
		Album album = new Album();
		
		//album.setAlbumId(albumDto.getAlbumId());
		album.setAlbumTitle(albumDto.getAlbumTitle());
		album.setCategoryId(albumDto.getCategory());
		album.setHirePrice(albumDto.getHirePrice());
		album.setNoOfCd(albumDto.getNoOfCd());
		album.setStatus(albumDto.getStatus());
		return album;
	}
}
