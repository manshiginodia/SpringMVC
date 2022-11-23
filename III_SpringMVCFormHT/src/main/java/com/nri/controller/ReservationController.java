package com.nri.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	ReservationDaoImpl rdaoobj;

	public ReservationDaoImpl getRdaoobj() {
		return rdaoobj;
	}

	public void setRdaoobj(ReservationDaoImpl rdaoobj) {
		this.rdaoobj = rdaoobj;
	}

	@RequestMapping(value = "/bookingForm")
	public String bookingForm(Model model) {

		Reservation rserv = new Reservation();
		model.addAttribute(rserv);

		return "reservation";
	}

	// insert a record
	@RequestMapping(value = "/submitForm")
	public String submitForm(@ModelAttribute("reservation") Reservation reservation) {
		rdaoobj.rcrInsert(reservation);

		return "confirmation";
	}

}



/*
We can capture the checked values in controller and store in pojo/model class as a object and 
finally store in to the database using hibernate.

The primary key attribute with the @GeneratedValue annotation and set GenerationType.SEQUENCE as 
the strategy. This tells Hibernate to use a database sequence to generate the primary key value. 
If you don’t provide any additional information, Hibernate will use its default sequence.

You can configure the name and schema of the database sequence with a @SequenceGenerator 
annotation like the one you can see in the following code snippet.

@Entity
public class Reservation {
 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
    @SequenceGenerator(name="author_generator", sequenceName = "author_seq")
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
     
    ...
     
}
*/










