package com.cd.casestudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cd.casestudy.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
