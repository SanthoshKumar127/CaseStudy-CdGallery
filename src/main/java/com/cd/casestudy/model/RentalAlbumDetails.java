package com.cd.casestudy.model;


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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long hireId;
	//TODO: convert to FK.
	@Column(name="customer_id")
	private long customerId;
	@ManyToOne
	@JoinColumn(name="album_id")
	private Album album;
	@Column(name="hire_date")
	private String hireDate;
	@Column(name="return_date")
	private String returnDate;
	@Column(name="status")
	private String status;
	@Column(name="total_hire_price")
	private double totlaHirePrice;

	public RentalAlbumDetails() {
		super();
	}

	public long getHireId() {
		return hireId;
	}

	public void setHireId(long hireId) {
		this.hireId = hireId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotlaHirePrice() {
		return totlaHirePrice;
	}

	public void setTotlaHirePrice(double totlaHirePrice) {
		this.totlaHirePrice = totlaHirePrice;
	}
	
	
	
		
}
