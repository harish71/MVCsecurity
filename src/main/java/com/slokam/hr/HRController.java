package com.slokam.hr;

import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.slokam.hr.Controller.PersonController;
import com.slokam.hr.entity.Personal;
import com.slokam.hr.repo.PersonalRepo;

@Controller
@RequestMapping("hr")
public class HRController {

	@Autowired
	private PersonalRepo personservice;
	
	private static final Logger LOGGER=LoggerFactory.getLogger(PersonController.class);
	
	 @RequestMapping("/goto")
	 @PreAuthorize("hasRole('ADMIN')")
	 public ModelAndView gotoHr() {
		// String name = SecurityContextHolder.getContext().getAuthentication().getName();
		
		 UserDetailsImpl udi = (UserDetailsImpl)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		 String name = udi.getUsername();
		/*
		 * Collection<GrantedAuthorityImpl> grants = udi.getAuthorities();
		 * System.out.println("User Roles::"); for (GrantedAuthorityImpl
		 * grantedAuthorityImpl : grants) {
		 * System.out.println(grantedAuthorityImpl.getAuthority()); }
		 */
		 
		 ModelAndView mv = new ModelAndView("hr");
		 mv.addObject("username", name);
		 return mv;
	 }
	 
	 
	 @RequestMapping("/personPage")
		@PreAuthorize("hasRole('ADMIN')")
		public ModelAndView gotoPersonPage(){
			LOGGER.info("Started into gotoPersonPage::");
	         ModelAndView mv=new ModelAndView();
	         mv.setViewName("personDetails");
	         LOGGER.info("Ended from gotoPersonPage::");
	         return mv;
		}
		@RequestMapping("/savePage")
		//@PreAuthorize("hasRole('ADMIN')")
		public ModelAndView savePersonDetails(Personal personal){
			
			LOGGER.info("Started into savePersonDetails::");
			personservice.save(personal);
			ModelAndView mv=new ModelAndView();
			mv.setViewName("personDetails");
			LOGGER.info("Ended from savePersonDetails::");
			return mv;
	 
	/* @RequestMapping("pageOne")
	 public ModelAndView pageOne() {
			
		 ModelAndView mv = new ModelAndView("one");
		 return mv;
	 }
	 
	 
	 @RequestMapping("pageTwo")
	 public ModelAndView pageTwo() {
			
		 ModelAndView mv = new ModelAndView("two");
		 return mv;
	 }*/
	 
		}
}
