package com.tbs.hello.entity;

public class Address {
	
	private Long id;
	private int postalCode;
	private String street;
	private String countrie;
	private String department;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCountrie() {
		return countrie;
	}
	public void setCountrie(String countrie) {
		this.countrie = countrie;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
