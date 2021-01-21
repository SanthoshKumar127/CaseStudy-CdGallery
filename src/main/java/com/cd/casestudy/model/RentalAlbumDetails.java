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
	@ManyToOne
	@JoinColumn(name="customer_id")
	private User customer;
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

	public RentalAlbumDetails(User customer, Album album, String hireDate, String returnDate,
			String status, double totlaHirePrice) {
		super();
		this.customer = customer;
		this.album = album;
		this.hireDate = hireDate;
		this.returnDate = returnDate;
		this.status = status;
		this.totlaHirePrice = totlaHirePrice;
	}



	public long getHireId() {
		return hireId;
	}

	public void setHireId(long hireId) {
		this.hireId = hireId;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
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

	@Override
	public String toString() {
		return "RentalAlbumDetails [hireId=" + hireId + ", customer=" + customer + ", album=" + album + ", hireDate="
				+ hireDate + ", returnDate=" + returnDate + ", status=" + status + ", totlaHirePrice=" + totlaHirePrice
				+ "]";
	}
	
	
	
		
}
