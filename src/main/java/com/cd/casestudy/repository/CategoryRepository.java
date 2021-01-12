package com.cd.casestudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cd.casestudy.model.CategoryAlbum;

public interface CategoryRepository extends JpaRepository<CategoryAlbum, Long>{

}
