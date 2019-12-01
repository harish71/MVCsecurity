package com.slokam.hr;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class UserDetailsServiceImpl implements UserDetailsService{
		
	   @Autowired
	   private LoginDao loginDao;
	   
	    @Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    	UserDetailsImpl ud = loginDao.findByUsername(username);
	        //ud.setPassword("{noop}"+ud.getPassword());
	    	ud.setPassword(ud.getPassword());
	    	List<GrantedAuthorityImpl> roles = loginDao.getRolesByUserName(username);
	    	ud.setAuthorities(roles);
	     return ud;	
		/*
		 * UserDetails ud = User.withDefaultPasswordEncoder()
		 * .username("sec").password("sec123").roles("USER").build();
		 */
	        /*
	    	UserDetailsImpl ud = new UserDetailsImpl();
	    	ud.setUsername("uuuu");
	    	ud.setPassword("{noop}pppp");
	    	ud.setAccountNonExpired(true);
	    	ud.setAccountNonLocked(true);
	    	ud.setCredentialsNonExpired(true);
	    	ud.setEnabled(true);
	    	
	    	GrantedAuthorityImpl ga1 = new GrantedAuthorityImpl();
	    	ga1.setAuthority("USER");
	    	GrantedAuthorityImpl ga2 = new GrantedAuthorityImpl();
	    	ga2.setAuthority("ADMIN");
	    	
	    	Collection<GrantedAuthorityImpl> grants =
	    			 new ArrayList<GrantedAuthorityImpl>();
	    	grants.add(ga1);
	    	grants.add(ga2);
	    	ud.setAuthorities(grants);
	    	
			return ud;
			*/
		}
	
}
