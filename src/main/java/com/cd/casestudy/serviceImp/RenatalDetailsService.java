package com.cd.casestudy.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cd.casestudy.model.RentalAlbumDetails;
import com.cd.casestudy.repository.RentalRepository;

@Service
public class RenatalDetailsService {

	@Autowired
	RentalRepository rentalRepository;
	
	public void newRentalDetails(@RequestBody RentalAlbumDetails rentalAlbumDetails)
	{
		rentalRepository.save(rentalAlbumDetails);
	}
	
	public List getAllRentalDetails()
	{
		return rentalRepository.findAll();
	}
}
