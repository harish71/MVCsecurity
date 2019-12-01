package com.slokam.hr;

import java.util.Collection;
import java.util.List;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hr")
public class HRController {

	 
	 @RequestMapping("/goto")
	 @PreAuthorize("hasRole('USER')")
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
	 
	 @RequestMapping("pageOne")
	 public ModelAndView pageOne() {
			
		 ModelAndView mv = new ModelAndView("one");
		 return mv;
	 }
	 
	 
	 @RequestMapping("pageTwo")
	 public ModelAndView pageTwo() {
			
		 ModelAndView mv = new ModelAndView("two");
		 return mv;
	 }
	 
	
}
