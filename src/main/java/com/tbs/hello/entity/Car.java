package com.tbs.hello.entity;

import java.util.Date;

public class Car {

	private Long id;
	private String serialNumber;
	private String mark;
	private String color;
	private Date dateOfConstruction;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getDateOfConstruction() {
		return dateOfConstruction;
	}
	public void setDateOfConstruction(Date dateOfConstruction) {
		this.dateOfConstruction = dateOfConstruction;
	}
	
}
