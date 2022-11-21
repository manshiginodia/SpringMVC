package com.nri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nri.model.Reservation;
import com.nri.model.User;

@Controller
public class UserController {

	@RequestMapping(path = "/")
	public String getRegForm() {
		return "register";
	}

//	
//	  @RequestMapping(path="/regform", method = RequestMethod.POST) public String
//	  getFormData(@RequestParam("userid") int userid,
//	  
//	  @RequestParam("useremail") String useremail,
//	  
//	  @RequestParam("username") String username,
//	 
//	  @RequestParam("userpwd") String userpwd, Model model) {
//	  
//	  model.addAttribute("uid", userid);
//	  
//	  System.out.println(userid+" "+useremail+" "+username+" "+userpwd);
//	  
//	  return "success"; }
//	 

	
	  @RequestMapping(path="/regform", method = RequestMethod.POST) 
	  
	  public String getFormData(@ModelAttribute User user) {
	  
	  System.out.println(user.getUserid()+" "+user.getUseremail()+" "+user.getUsername()+" "+user.getUserpwd());
	  
	  return "success"; 
	  }
	  
	  

	  @RequestMapping(path="/reservation") 
	  
	  public String getFormData(@ModelAttribute Reservation reserv ) {
	
	  return "reservation"; 
	  }
}
