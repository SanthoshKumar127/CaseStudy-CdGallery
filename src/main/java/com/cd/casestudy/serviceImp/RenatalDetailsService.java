package com.cd.casestudy.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cd.casestudy.converter.RentalConverter;
import com.cd.casestudy.dto.RentalDetailsDTO;
import com.cd.casestudy.model.RentalDetails;
import com.cd.casestudy.repository.RentalRepository;

@Service
public class RenatalDetailsService {

	@Autowired
	RentalRepository rentalRepository;
	
	@Autowired
	RentalConverter rentalConverter;
	
	public void newRentalDetails(@RequestBody RentalDetailsDTO rentalAlbumDetails)
	{
		RentalDetails rental =  rentalConverter.dtoToEntity(rentalAlbumDetails);
		rentalRepository.save(rental);
	}
	
	public List<RentalDetailsDTO> getAllRentalDetails()
	{
		List<RentalDetails> rental = rentalRepository.findAll();
		return rentalConverter.entityToDto(rental);
	}
}
