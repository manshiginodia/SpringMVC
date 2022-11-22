package com.nri.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nri.entities.Employee;

@Controller
public class EmployeeController {

	@RequestMapping(value = "/msg")
	public String display(Model model) {

		// gives number format exception
		String myname = "Manshi";
		System.out.println(Integer.parseInt(myname));

		model.addAttribute("empobj", new Employee());
		return "viewpage";
	}

	@RequestMapping(value = "/msgagain")
	public String subForm(@Valid @ModelAttribute("empobj") Employee empobj, BindingResult br) {

		if (br.hasErrors()) {
			return "viewpage";
		} else {
			return "success";
		}

	}

}
