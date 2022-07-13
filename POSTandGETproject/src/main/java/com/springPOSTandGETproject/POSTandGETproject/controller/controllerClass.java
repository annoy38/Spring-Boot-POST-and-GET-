package com.springPOSTandGETproject.POSTandGETproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springPOSTandGETproject.POSTandGETproject.cutomer.customerClass;

@Controller
public class controllerClass {

	@ModelAttribute
	public void headerPart(Model title) {
		title.addAttribute("title", "Hayder Automobile Ltd.");
	}
	
	@GetMapping("/")
	public String homePage() {
		return "homePage.html";
	}
	
	@PostMapping("/saveInfo")
	public ModelAndView save_customer_data(@ModelAttribute ("customer") customerClass customer) {
		ModelAndView model = new ModelAndView();
		model.setViewName("customerInfo.html");
		
		return model;
	}
	
	@GetMapping("/allcustomers")
	public String allCustomerData(Model m) {
		List<customerClass> c = new ArrayList<customerClass>();
		c.add(new customerClass("Annoy", "Narayanganj", 50000, "41258963"));
		c.add(new customerClass("Fahim", "Narayanganj", 40000, "85968963"));
		c.add(new customerClass("Riaz", "Dhaka", 900000, "41257485"));
		c.add(new customerClass("Rayna", "Dhanmondi", 30000, "41785963"));
		c.add(new customerClass("Anasua", "Foridpur", 1000000, "6521498"));
		m.addAttribute("customers", c);
		
		return "allCustomer.html";
	}
}
