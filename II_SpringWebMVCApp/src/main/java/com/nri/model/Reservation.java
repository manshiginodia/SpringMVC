package com.nri.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Reservation {

	
	private String firstName;
	private String lastName;
	private String gender;
	private List<String> food;
	private String cityFrom;
	private String cityTo;
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getFood() {
		return food;
	}
	public void setFood(List<String> food) {
		this.food = food;
	}
	public String getCityFrom() {
		return cityFrom;
	}
	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}
	public String getCityTo() {
		return cityTo;
	}
	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}
	
}
