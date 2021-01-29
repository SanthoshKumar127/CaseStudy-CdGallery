package com.cd.casestudy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cd.casestudy.model.RentalAlbumDetails;
import com.cd.casestudy.repository.RentalRepository;
import com.cd.casestudy.serviceImp.RenatalDetailsService;

@RestController
@RequestMapping("/api/")
public class RentalDetailsController {
	
	@Autowired
	RenatalDetailsService rentalDetailsService;
	
	
	//save the rental Details
	@PostMapping("/rentaldetails")
	public void newRentalDetails(@RequestBody RentalAlbumDetails rentalAlbumDetails)
	{
		rentalDetailsService.newRentalDetails(rentalAlbumDetails);
	}
	
	@GetMapping("/allrentalsdetails")
	public List getAllRentalDetails()
	{
		return rentalDetailsService.getAllRentalDetails();
	}
}
