package com.cd.casestudy.dto;

import com.cd.casestudy.model.Album;
import com.cd.casestudy.model.User;

public class RentalDetailsDTO {

	
	private long hireId;
	private User userId;
	private Album albumId;
	private String hireDate;
	private int noOfDays;
	private String status;
	private double totalPrice;
	
	
	public RentalDetailsDTO() {
		super();
	}


	public long getHireId() {
		return hireId;
	}


	public void setHireId(long hireId) {
		this.hireId = hireId;
	}


	public User getUser() {
		return userId;
	}


	public void setUser(User userId) {
		this.userId = userId;
	}


	public Album getAlbum() {
		return albumId;
	}


	public void setAlbum(Album album) {
		this.albumId = album;
	}


	public String getHireDate() {
		return hireDate;
	}


	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}


	public int getNoOfDays() {
		return noOfDays;
	}


	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	
	
	
}
