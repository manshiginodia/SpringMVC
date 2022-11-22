package com.nri.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;


@ControllerAdvice
public class MyExceptionHandler {

	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String nullPointerExHandler(Model model) {
		
		model.addAttribute("msg", "Dear user null pointer exception has occured");
		return "nullerror";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String numberFormatExHandler(Model model) {
		
		model.addAttribute("msg", "Dear user wrong type casting has occured");
		return "nfeerror";
	}
	
}
