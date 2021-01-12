package com.cd.casestudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cd.casestudy.model.Album;

public interface AlbumRepository extends JpaRepository<Album, Long>{

}
