package com.slokam.hr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component 
public class OurAthenticationSuccessHandler implements AuthenticationSuccessHandler {

	RedirectStrategy rs = new DefaultRedirectStrategy();
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, 
			HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		UserDetailsImpl ud = (UserDetailsImpl)authentication.getPrincipal();
		System.out.println(ud.getUsername());
		for(GrantedAuthorityImpl grant: ud.getAuthorities()) {
			System.out.println(grant.getAuthority());
		}
		Collection<GrantedAuthorityImpl> grants = ud.getAuthorities();
		String url = getUrl(grants);
		
		rs.sendRedirect(request, response, url);
	}
	
	private String getUrl(Collection<GrantedAuthorityImpl> grants) {
		String url ="/hr/";
		   Collection<String> roles = new ArrayList<String>();
		   for (GrantedAuthorityImpl grantedAuthorityImpl : grants) {
			  roles.add(grantedAuthorityImpl.getAuthority());
		   }
		
		   if(roles.contains("ROLE_ADMIN")) {
			   url= url+"goto";
		   }else if(roles.contains("ROLE_MANAGER")){
			   url=url+"pageOne";
		   }else if(roles.contains("ROLE_USER")) {
			   url= url+"pageTwo";
		   }
		   
		return url;
	}
	
	
	
}
