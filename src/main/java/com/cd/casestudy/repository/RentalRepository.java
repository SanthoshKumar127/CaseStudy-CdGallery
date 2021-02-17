package com.cd.casestudy.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cd.casestudy.model.RentalDetails;

public interface RentalRepository extends PagingAndSortingRepository<RentalDetails, Long>{

	
}
