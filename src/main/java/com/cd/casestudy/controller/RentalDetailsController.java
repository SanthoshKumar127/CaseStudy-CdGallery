package com.cd.casestudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cd.casestudy.dto.RentalDetailsDTO;
import com.cd.casestudy.model.RentalDetails;
import com.cd.casestudy.serviceImp.RenatalDetailsService;

@RestController
@RequestMapping("/api/")
public class RentalDetailsController {
	
	@Autowired
	RenatalDetailsService rentalDetailsService;
	
	
	//save the rental Details
	@PostMapping("/rentaldetails")
	public void newRentalDetails(@RequestBody RentalDetailsDTO rentalAlbumDetails)
	{
		rentalDetailsService.newRentalDetails(rentalAlbumDetails);
	}
	
	@GetMapping("/allrentalsdetails")
	public List<RentalDetailsDTO> getAllRentalDetails()
	{
		return rentalDetailsService.getAllRentalDetails();
	}
}
