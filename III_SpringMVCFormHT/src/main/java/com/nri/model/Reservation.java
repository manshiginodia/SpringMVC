package com.nri.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;

//model represents data for the application
@Entity
public class Reservation {

	// name of text fields should be same and the order should also be maintained
	@Id
	private int pId;
	private String firstName;
	private String lastName;
	private String gender;
	private String[] food;
	private String cityFrom;
	private String cityTo;

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(int pId, String firstName, String lastName, String gender, String[] food, String cityFrom,
			String cityTo) {
		super();
		this.pId = pId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.food = food;
		this.cityFrom = cityFrom;
		this.cityTo = cityTo;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
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

	public String[] getFood() {
		return food;
	}

	public void setFood(String[] food) {
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

	@Override
	public String toString() {
		return "Reservation [pId=" + pId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", food=" + Arrays.toString(food) + ", cityFrom=" + cityFrom + ", cityTo=" + cityTo + "]";
	}

}
