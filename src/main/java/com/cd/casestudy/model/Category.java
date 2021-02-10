package com.cd.casestudy.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="category")
public class Category {
	
	@Id
	@Column(name="category_id")
	private long categoryId;
	@Column(name="category_name")
	private String categoryName;
	@Column(name="category_description")
	private String categoryDescription;
 
	@OneToMany(mappedBy = "category")
	List<Album> album;
	
	public Category() {
		super();
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	

		
}
