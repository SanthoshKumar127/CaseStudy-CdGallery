package com.cd.casestudy.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cd.casestudy.model.Category;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Long>{

}
