package com.thirdware.coreconcept;

public class PersonalInfo {
	private int id;
	private String phone, address;
	private char gender;
	public PersonalInfo(int id, String phone, String address, char gender) {
		super();
		this.id = id;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public char getGender() {
		return gender;
	}
	
	
	
}
