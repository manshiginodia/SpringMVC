package com.nri.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nri.dao.ReservationDaoImpl;
import com.nri.model.Reservation;

@Controller
//@RequestMapping(value ="/ticket")
public class ReservationController {

	ReservationDaoImpl rdaoobj;
	
	
	public ApplicationContext getIoC() {
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("nrispring-servlet.xml");
		return ioc;
	}

	@RequestMapping(value = "/bookingForm")
	public String bookingForm(Model model) {

		Reservation rserv = new Reservation();
		model.addAttribute(rserv);

		return "reservation";
	}

	// insert a record
	@RequestMapping(value ="/submitForm")
	public String submitForm(@ModelAttribute("reservation") Reservation reservation) {
		rdaoobj= (ReservationDaoImpl)getIoC().getBean("reservDao");
		rdaoobj.rcrInsert(reservation);
		
		
		return "confirmation";
	}

}
