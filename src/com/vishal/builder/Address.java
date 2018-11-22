package com.vishal.builder;

public class Address {
	private String houseNum;
	private String street;
	private String city;
	
	public Address(String houseNum, String street, String city) {
		super();
		this.houseNum = houseNum;
		this.street = street;
		this.city = city;
	}
	public String getHouseNum() {
		return houseNum;
	}
	
	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
