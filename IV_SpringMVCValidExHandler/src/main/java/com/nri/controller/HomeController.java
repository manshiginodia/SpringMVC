package com.nri.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.nri.entities.Employee;

@Controller
public class HomeController {  

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		
		// Gives null ptr exception
//		Employee empobj= null;
//		System.out.println(empobj.toString());
		
		// gives number format exception
		String myname="Manshi";
		System.out.println(Integer.parseInt(myname));
		
		return new ModelAndView("home");
	}
	
	
	
}
