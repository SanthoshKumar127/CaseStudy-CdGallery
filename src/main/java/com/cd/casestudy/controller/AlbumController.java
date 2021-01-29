package com.cd.casestudy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cd.casestudy.exception.ResourceNotFound;
import com.cd.casestudy.model.Album;
import com.cd.casestudy.serviceImp.AlbumService;

@RestController
@RequestMapping("/api")
public class AlbumController {
	
	@Autowired
	AlbumService albumService;
	
	@PostMapping("/new-Album")
	public Album newAlbum(@RequestBody Album album)
	{
		return albumService.newAlbum(album);
	  
	}
	
	@GetMapping("/album")
	public List getAllALbum()
	{
		return albumService.getAllAlbum();
	}
	
	@GetMapping("/album/{id}")
	public ResponseEntity<Optional<Album>> getAlbumById(@PathVariable("id") long albumId) throws ResourceNotFound
	{
		return  albumService.getAlbumById(albumId);
	}
	
	@DeleteMapping("/deleteAlbum/{id}")
	public void deleteByAlbumId(@PathVariable("id") long albumId) throws ResourceNotFound
	{
		albumService.delete(albumId);
	}
}
