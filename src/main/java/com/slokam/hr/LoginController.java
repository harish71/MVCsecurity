package com.slokam.hr;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	private ILoginService loginService;
	
	@RequestMapping("loginPage")
	public ModelAndView gotoLogin() {
		return new ModelAndView("ourloginPage");
	}
	
	@RequestMapping("regisPage")
	public ModelAndView regisPage() {
		return new ModelAndView("regisPage");
	}
	
	@RequestMapping("regis")
	public ModelAndView regis(UserDetailsImpl userDetails) {
		 GrantedAuthorityImpl role = new GrantedAuthorityImpl();
		 role.setId(2);
		 Collection<GrantedAuthorityImpl> collection =
				 new ArrayList<GrantedAuthorityImpl>();
		 collection.add(role);
		 userDetails.setAuthorities(collection);
		 userDetails.setAccountNonExpired(true);
		 userDetails.setAccountNonLocked(true);
		 userDetails.setEnabled(true);
		 userDetails.setCredentialsNonExpired(true);
		 
		 // 1.set roles to userDetails
		 // 2.save userDetails
		 loginService.saveUser(userDetails);
		return new ModelAndView("ourloginPage");
	}
}
