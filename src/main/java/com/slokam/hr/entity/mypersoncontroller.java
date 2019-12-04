package com.slokam.hr.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.slokam.hr.repo.PersonalRepo;

@Controller
public class mypersoncontroller {
	
	@Autowired
	private PersonalRepo dao;
	@GetMapping("personal")
	public ModelAndView gotopersonpage()
	{
		return new ModelAndView("homepage");
	}
	@GetMapping("saveperson")
	public ModelAndView saveperson(Personal person)
	{
		dao.save(person);
		return new ModelAndView("two");
	}

}
