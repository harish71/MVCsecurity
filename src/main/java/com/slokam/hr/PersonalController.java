package com.slokam.hr;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.slokam.hr.entity.Country;
import com.slokam.hr.entity.Personal;
import com.slokam.hr.service.CountryService;
import com.slokam.hr.service.PersonalService;

@Controller
@RequestMapping("/person")
public class PersonalController {
	@Autowired
	private PersonalService pers;
	
	@Autowired
	private CountryService cs;
	
	//@PreAuthorize("hasRole('MANAGER')")
	@RequestMapping("/goperson")
	public ModelAndView diiPlayperson(Personal pr)
	{
		ModelAndView mv=new ModelAndView();
		pers.save(pr);
	List<Country>crty= cs.getAll();
		mv.setViewName("persons");
        mv.addObject("conrar", crty);
		//return new ModelAndView("persons","contrrattr",countries);
	  return mv;
	}
	/*@RequestMapping("/personde")
	public ModelAndView savePerson()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("persons");
		return mv;
	}*/
	
	

}
