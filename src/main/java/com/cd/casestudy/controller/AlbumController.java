package com.cd.casestudy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cd.casestudy.exception.ResourceNotFound;
import com.cd.casestudy.model.Album;
import com.cd.casestudy.repository.AlbumRepository;

@RestController
@RequestMapping("/api")
public class AlbumController {
	
	@Autowired
	private AlbumRepository albumRepository;

	
	//create Get all alum List
	@GetMapping("/album")
	public List<Album> getAllAlbum(){
		return albumRepository.findAll();
	}
	
	//Create AddAlbum(post)
	@PostMapping("/album")
	public Album createAddAlbum(@Validated @RequestBody Album addAlbum) {
		return albumRepository.save(addAlbum);
	}
	
	
	//Get a album by albumId
	@GetMapping("/album/{id}")
	public ResponseEntity<Optional<Album>> getAlbumByAlbumId(@PathVariable (value = "id")long albumId){
		Optional<Album> addAlbum = albumRepository.findById(albumId);
		return ResponseEntity.ok().body(addAlbum);
	}
	

		
	// update album Details
	@PutMapping("/album/{id}")
	public ResponseEntity<Album> updateAlbum(@PathVariable(value = "id")long albumId, @RequestBody Album albumDetails) throws ResourceNotFound {
		Optional<Album> album = albumRepository.findById(albumId);
		
		if(!album.isPresent()==true)
		{
			throw new ResourceNotFound("Album is not available in this albumId ::" + albumId);
		}
		else
		{
			Album album1 = album.get();
			album1.setCategoryId(albumDetails.getCategoryId());
			album1.setAlbumTitle(albumDetails.getAlbumTitle());
			album1.setHirePrice(albumDetails.getHirePrice());
			album1.setNoOfCd(albumDetails.getNoOfCd());
			album1.setStatus(albumDetails.getStatus());
			albumRepository.save(album1);
			return ResponseEntity.ok().body(album1);
		}	
	}
	
	//delete album 
	@DeleteMapping("/album/{id}")
	public ResponseEntity<Album> deleteAlbum(@PathVariable(value = "id")long albumId) throws ResourceNotFound{
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
	
	@PutMapping("/noofcd")
	public void updateCd(@PathVariable(value = "id")long albumId, @RequestBody Album albumDetails) throws ResourceNotFound {
		Optional<Album> album = albumRepository.findById(albumId);
		

		if(!album.isPresent()==true)
		{
			throw new ResourceNotFound("Album is not available in this albumId :" + albumId);
		}
		else
		{
			Album album2 = album.get();
			int cd = album2.getNoOfCd() - 1;
			album2.setNoOfCd(cd);
			
		}
	}
}
