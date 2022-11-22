package com.nri.entities;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {

	private String uname;
	//@Size(min=4, message ="Minimum 4 characters required for password")
	@Pattern(regexp ="^[a-zA-Z0-9]{3}", message="Length must be 3 or more according to regex")
	private String upass;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	@Override
	public String toString() {
		return "Employee [uname=" + uname + ", upass=" + upass + "]";
	}
	
}
