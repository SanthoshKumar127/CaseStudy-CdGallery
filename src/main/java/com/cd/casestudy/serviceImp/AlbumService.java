package com.cd.casestudy.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cd.casestudy.exception.ResourceNotFound;
import com.cd.casestudy.model.Album;
import com.cd.casestudy.repository.AlbumRepository;

@Service
public class AlbumService {

	@Autowired
	AlbumRepository albumRepository;
	
	// save the new album
	public Album newAlbum(Album album) {
		return albumRepository.save(album);
	}
	
	//getting all the album
	
	public List getAllAlbum() {
		return albumRepository.findAll();
	}
	
	//getting the album using albumID
	public ResponseEntity<Optional<Album>> getAlbumById(long albumId) throws ResourceNotFound {
		Optional<Album> album = albumRepository.findById(albumId);
		if(!album.isPresent())
		{
			throw new ResourceNotFound("Album is not available in this albumId :" + albumId);
		}
		else
		{
			return ResponseEntity.ok(album);
		}
		
	}
	
	//delete the album details
	public ResponseEntity<Album> delete(long albumId) throws ResourceNotFound
	{
		Optional<Album> deleteId = albumRepository.findById(albumId);
		if(!deleteId.isPresent()==true)
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
