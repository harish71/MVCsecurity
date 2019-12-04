package com.slokam.hr;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@RequestMapping("employee")
	//@PreAuthorize("hasRole('manager')")
	public ModelAndView gotoEmployee(){
		
		return new ModelAndView();
	}
}
