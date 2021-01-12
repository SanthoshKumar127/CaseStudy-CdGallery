package com.cd.casestudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cd.casestudy.model.RentalAlbumDetails;

public interface RentalRepository extends JpaRepository<RentalAlbumDetails, Long>{

}
