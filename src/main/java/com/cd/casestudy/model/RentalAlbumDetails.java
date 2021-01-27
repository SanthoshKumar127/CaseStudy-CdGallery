package com.cd.casestudy.model;


import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rental_details")
public class RentalAlbumDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long hireId;
	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name="user_id")
	private User user;
	@ManyToOne(targetEntity = Album.class)
	@JoinColumn(name="album_id")
	private Album album;
	@Column(name="hire_date")
	private String hireDate;
	@Column(name="no_of_days")
	private int noOfDays;
	@Column(name="status")
	private String status;
	@Column(name="total_price")
	private double totalPrice;

	public RentalAlbumDetails() {
		super();
	}


	public long getHireId() {
		return hireId;
	}

	public void setHireId(long hireId) {
		this.hireId = hireId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
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

	public double gettotalPrice() {
		return totalPrice;
	}

	public void settotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "RentalAlbumDetails [hireId=" + hireId + ", User=" + user + ", album=" + album + ", hireDate="
				+ hireDate + ", noOfDays=" + noOfDays + ", status=" + status + ", totalPrice=" + totalPrice
				+ "]";
	}
	
	
	
		
}
