package com.cd.casestudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cd.casestudy.model.RentalAlbumDetails;
import com.cd.casestudy.repository.RentalRepository;

@RestController
@RequestMapping("/api/")
public class RentalDetailsController<E> {

	@Autowired
	public RentalRepository rentalRepository;
	
	
	//Get the rental details
	@GetMapping("/rentaldetails")
	public List<RentalAlbumDetails> getRentalDetails(){
		return rentalRepository.findAll();
	}
	
}
