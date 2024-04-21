package com.kyc.bankservice.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private int houseNo;
	private String streetName;
	private String city;
	private String zipCode;
	
	
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public Address(int houseNo, String streetName, String city, String zipCode) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.city = city;
		this.zipCode = zipCode;
	}
	
	public Address() {
		super();
	}
	
}
