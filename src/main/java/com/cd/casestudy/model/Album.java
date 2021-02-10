 package com.cd.casestudy.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "album")
public class Album {
	
	@Id
	@Column(name="album_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long albumId;
	@ManyToOne(targetEntity = Category.class)
	@JoinColumn(name = "category_id")
	private Category category;
	@Column(name = "album_title")
	private String albumTitle;
	@Column(name = "hire_price")
	private double hirePrice;
	@Column(name = "no_of_cd")
	private int noOfCd;
	@Column(name = "status")
	private String status;
	
	
	@OneToMany(mappedBy = "album")
	List<RentalDetails> rental;
	

	public Album() {
		super();
	}

	public long getAlbumId() {
		return albumId;
	}

	public void setAlbumId(long albumId) {
		this.albumId = albumId;
	}

	public Category getCategoryId() {
		return category;
	}

	public void setCategoryId(Category category) {
		this.category = category;
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
