package com.cd.casestudy.dto;



public class AlbumDTO {

	
	private long albumId;
	private long categoryId;
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
	public long getCategory() {
		return categoryId;
	}
	public void setCategory(long categoryId) {
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
		return "AlbumDTO [albumId=" + albumId + ", categoryId=" + categoryId + ", albumTitle=" + albumTitle
				+ ", hirePrice=" + hirePrice + ", noOfCd=" + noOfCd + ", status=" + status + "]";
	}
	
	
	
}
