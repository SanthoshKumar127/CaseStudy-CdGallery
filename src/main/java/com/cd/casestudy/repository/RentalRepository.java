package com.cd.casestudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cd.casestudy.model.RentalDetails;

public interface RentalRepository extends JpaRepository<RentalDetails, Long>{

	
}
