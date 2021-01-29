package com.cd.casestudy.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cd.casestudy.model.Album;


@Repository
public interface AlbumRepository extends JpaRepository<Album, Long>{
 
}
