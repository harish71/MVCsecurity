package com.slokam.hr.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.slokam.hr.entity.Personal;
import com.slokam.hr.repo.PersonalRepo;
import com.slokam.hr.service.PersonalService;

@Controller

public class PersonController {

	@Autowired
	private PersonalRepo personservice;

    private static final Logger LOGGER=LoggerFactory.getLogger(PersonController.class);
	
	@RequestMapping("1personPage")
	@PreAuthorize("hasRole('ADMIN')")
	public ModelAndView gotoPersonPage(){
		LOGGER.info("Started into gotoPersonPage::");
         ModelAndView mv=new ModelAndView();
         mv.setViewName("personDetails");
         LOGGER.info("Ended from gotoPersonPage::");
         return mv;
	}
	@RequestMapping("2savePage")
	@PreAuthorize("hasRole('ADMIN')")
	public ModelAndView savePersonDetails(Personal personal){
		LOGGER.info("Started into savePersonDetails::");
		personservice.save(personal);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("personDetails");
		LOGGER.info("Ended from savePersonDetails::");
		return mv;
	}
}
