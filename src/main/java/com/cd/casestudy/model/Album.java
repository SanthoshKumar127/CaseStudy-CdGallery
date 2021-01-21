package com.cd.casestudy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "album")
public class Album {
	
	@Id
	private long albumId;
	@Column(name = "category_id")
	private long categoryId;
	@Column(name = "album_title")
	private String albumTitle;
	@Column(name = "hire_price")
	private double hirePrice;
	@Column(name = "no_of_cd")
	private int noOfCd;
	@Column(name = "status")
	private String status;
	
	public Album() {
		super();
	}

	public Album(long albumId, int categoryId, String albumTitle, double hirePrice, int noOfCd, String status) {
		super();
		this.albumId = albumId;
		this.categoryId = categoryId;
		this.albumTitle = albumTitle;
		this.hirePrice = hirePrice;
		this.noOfCd = noOfCd;
		this.status = status;
	}

	public long getAlbumId() {
		return albumId;
	}

	public void setAlbumId(long albumId) {
		this.albumId = albumId;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
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

	@Override
	public String toString() {
		return "Album [albumId=" + albumId + ", categoryId=" + categoryId + ", albumTitle=" + albumTitle
				+ ", hirePrice=" + hirePrice + ", noOfCd=" + noOfCd + ", status=" + status + "]";
	}
	
	
	
}
