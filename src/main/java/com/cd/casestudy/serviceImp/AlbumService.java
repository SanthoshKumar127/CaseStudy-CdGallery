package com.cd.casestudy.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cd.casestudy.converter.AlbumConverter;
import com.cd.casestudy.dto.AlbumDTO;
import com.cd.casestudy.exception.ResourceNotFound;
import com.cd.casestudy.model.Album;
import com.cd.casestudy.repository.AlbumRepository;

@Service
public class AlbumService {

	@Autowired
	AlbumRepository albumRepository;
	
	@Autowired
	AlbumConverter albumConverter;
	
	// save the new album
	public AlbumDTO newAlbum(@RequestBody AlbumDTO album) 
	{
		AlbumDTO newAlbum = albumConverter.dtoToEntity(album);
		return albumRepository.save(newAlbum);
	}
	
	//getting all the album
	
	public List<AlbumDTO> getAllAlbum() {
		
		List<Album> album = (List<Album>) albumRepository.findAll();
		return albumConverter.entityToDto(album);
		
	}
	
	//getting the album using albumID
	public ResponseEntity<Optional<Album>> getAlbumById(long albumId) throws ResourceNotFound {
		Optional<Album> album =albumRepository.findById(albumId); 
		if(!album.isPresent()==true)
		{
			throw new ResourceNotFound("Album is not available in this albumId :" + albumId);
		}
		else
		{
			return ResponseEntity.ok(album);
		}
		
	}
	
	//delete the album details
	public ResponseEntity<AlbumDTO> delete(long albumId) throws ResourceNotFound
	{
		Optional<Album> deleteId = albumRepository.findById(albumId);
		if(!deleteId.isPresent())
		{
			throw new ResourceNotFound("Album is not available in this albumId :" + albumId);
		}
		else
		{
			albumRepository.deleteById(albumId);
			return ResponseEntity.ok().build();
		}
	}
}
