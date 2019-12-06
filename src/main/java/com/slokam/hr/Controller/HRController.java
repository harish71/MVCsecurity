package com.slokam.hr.Controller;

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

import com.slokam.hr.UserDetailsImpl;
import com.slokam.hr.entity.Country;
import com.slokam.hr.entity.Gender;
import com.slokam.hr.entity.MaritalStatus;
import com.slokam.hr.entity.Personal;
import com.slokam.hr.entity.Religion;
import com.slokam.hr.entity.State;
import com.slokam.hr.repo.PersonalRepo;
import com.slokam.hr.service.CountryService;
import com.slokam.hr.service.GenderService;
import com.slokam.hr.service.MaritalStatusService;
import com.slokam.hr.service.PersonalService;
import com.slokam.hr.service.ReligionService;
import com.slokam.hr.service.StateService;

@Controller
@RequestMapping("hr")
public class HRController {

	@Autowired
	private PersonalService personService;
	
	@Autowired
	private GenderService genderService;
	
	@Autowired
	private StateService stateService;
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private MaritalStatusService  maritalStatusService;
	
	@Autowired
	public ReligionService religionService;
	
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
			ModelAndView mv = new ModelAndView();
			
		 mv.setViewName("hr");
		 mv.addObject("username", name);
		 return mv;
	 }
	 
	 
	 @RequestMapping("/personPage")
		@PreAuthorize("hasRole('ADMIN')")
		public ModelAndView gotoPersonPage(){
			LOGGER.info("Started into gotoPersonPage::");
			List<Gender> genders=	genderService.getAll();
			List<State> states= stateService.getAll();
			List<Country> country=countryService.getAll();
			List<Religion> religion=religionService.getAll();
			List<MaritalStatus> maritalStatus=maritalStatusService.getAll();
			
	         ModelAndView mv=new ModelAndView();
	         mv.addObject("gendersAttr",genders);
				mv.addObject("statesAttr",states);
				mv.addObject("countryAttr",country);
				mv.addObject("religionsAttr",religion);
				mv.addObject("martialstatusAttr",maritalStatus);
	         mv.setViewName("personDetails");
	         LOGGER.info("Ended from gotoPersonPage::");
	         return mv;
		}
		@RequestMapping("/savePage")
		@PreAuthorize("hasRole('ADMIN')")
		public ModelAndView savePersonDetails(Personal personal){
			
			LOGGER.info("Started into savePersonDetails::");
			personService.save(personal);
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
