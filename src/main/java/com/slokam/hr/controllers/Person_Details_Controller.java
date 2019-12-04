package com.slokam.hr.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.slokam.hr.entity.Personal;
import com.slokam.hr.service.PersonalService;

@Controller
public class Person_Details_Controller {
	Logger logger=LoggerFactory.getLogger(Person_Details_Controller.class);
	@Autowired
	private PersonalService personalService;

	@RequestMapping("/showFormPage")
	 ModelAndView showFormPage() {
		
		return new ModelAndView("FormPage");
	}
	@RequestMapping("/nextPageOne")
     ModelAndView savePage(Personal person) {
		logger.info("Enter into Save PAge");
    	 personalService.save(person);
    	 logger.info("Exit from save Page");
    	 return new ModelAndView("NextAddPage");
	}
	
	
}
