package com.cd.casestudy.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cd.casestudy.dto.RentalDetailsDTO;
import com.cd.casestudy.model.RentalDetails;

@Component
public class RentalConverter {

	public RentalDetailsDTO entityToDto(RentalDetails rental)
	{
		RentalDetailsDTO dto = new RentalDetailsDTO();
		
		dto.setHireId(rental.getHireId());
		dto.setAlbum(rental.getAlbum());
		dto.setUser(rental.getUser());
		dto.setHireDate(rental.getHireDate());
		dto.setNoOfDays(rental.getNoOfDays());
		dto.setStatus(rental.getStatus());
		dto.setTotalPrice(rental.gettotalPrice());
		
		return dto;
		
	}
	
	public List<RentalDetailsDTO> entityToDto(List<RentalDetails> rental)
	{
		return rental.stream().map(x->entityToDto(x)).collect(Collectors.toList());
	}
	
	public RentalDetails dtoToEntity(RentalDetailsDTO dto)
	{
		RentalDetails rental = new RentalDetails();
		
		rental.setHireId(dto.getHireId());
		rental.setAlbum(dto.getAlbum());
		rental.setUser(dto.getUser());
		rental.setHireDate(dto.getHireDate());
		rental.setNoOfDays(dto.getNoOfDays());
		rental.setStatus(dto.getStatus());
		rental.settotalPrice(dto.getTotalPrice());
		
		return rental;
		
	}
}
