package com.cd.casestudy.dto;

import java.io.Serializable;

import com.cd.casestudy.model.Category;

public class AlbumDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long albumId;
	private Category categoryId;
	private String albumTitle;
	private double hirePrice;
	private int noOfCd;
	private String status;
	
	public AlbumDTO() {
		super();
	}
	

	public long getAlbumId() {
		return albumId;
	}
	public void setAlbumId(long albumId) {
		this.albumId = albumId;
	}
	public Category getCategory() {
		return categoryId;
	}
	public void setCategory(Category category) {
		this.categoryId = category;
	}
	public String getAlbumTitle() {
		return albumTitle;
	}
	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}
	public double getHirePrice() {
		return hirePrice;
	}
	public void setHirePrice(double hirePrice) {
		this.hirePrice = hirePrice;
	}
	public int getNoOfCd() {
		return noOfCd;
	}
	public void setNoOfCd(int noOfCd) {
		this.noOfCd = noOfCd;
	}
	public String getStatus() {	
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
