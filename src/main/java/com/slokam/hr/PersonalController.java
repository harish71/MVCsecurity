package com.slokam.hr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hr")
public class PersonalController {
	
	@RequestMapping("/personalPage")
	public ModelAndView personalPage()
	{
		ModelAndView mv=new ModelAndView("personal");
		return mv;
	}

}
