package com.cd.casestudy.dto;

import java.util.List;

public class CategoryDTO {

	
	private long categoryId;
	private String categoryName;
	private String categoryDescription;
	private List<AlbumDTO> albumList;
	
	public CategoryDTO() {
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

	public List<AlbumDTO> getalbumList() {
		return albumList;
	}

	public void setalbumList(List<AlbumDTO> albumList) {
		this.albumList = albumList;
	}

	@Override
	public String toString() {
		return "CategoryDTO [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDescription="
				+ categoryDescription + ", albumList=" + albumList + "]";
	}
	
	
}
