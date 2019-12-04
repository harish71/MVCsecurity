package com.slokam.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.slokam.hr.entity.Personal;
import com.slokam.hr.service.impl.PersonalServiceImpl;


@Controller
@RequestMapping("hr")
public class PersonalController {
	@Autowired
	private PersonalServiceImpl psimpl;
	@RequestMapping("/personalPage")
	public ModelAndView personalPage()
	{
		ModelAndView mv=new ModelAndView("personal");
		return mv;
	}
	
	@RequestMapping("/save")
	public ModelAndView savePage(Personal person)
	{
		psimpl.save(person);
		
		ModelAndView mv=new ModelAndView("personal");
		
		return mv;
	}

}
