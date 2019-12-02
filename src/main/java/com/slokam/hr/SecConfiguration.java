package com.slokam.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true,prePostEnabled = true)
public class SecConfiguration extends WebSecurityConfigurerAdapter {
    //asdf asdfasdf
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	
	@Bean
	public BCryptPasswordEncoder bcryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Autowired
	private OurAthenticationSuccessHandler successHandler;
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//disable().
		   http.csrf().and().
		   authorizeRequests().
		   antMatchers("/regisPage","/regis").permitAll().
		   anyRequest().authenticated().and().
		   formLogin().loginPage("/loginPage").
		   loginProcessingUrl("/abc").
		   usernameParameter("userName").
		   passwordParameter("password").
		   successHandler(successHandler).
		   //defaultSuccessUrl("/hr/goto",true).
		   permitAll().
		   and().logout().logoutUrl("/logout")
		   .deleteCookies().invalidateHttpSession(true)
		   .logoutSuccessUrl("/loginPage")
		   .permitAll();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}
	
	/*
	 * @Override
	 * 
	 * @Bean protected UserDetailsService userDetailsService() { UserDetails ud=
	 * User.withDefaultPasswordEncoder().
	 * username("skm1").password("123").roles("USER").
	 * username("skm2").password("321").roles("ADMIN").
	 * username("skm3").password("321").roles("USER","ADMIN"). build(); return new
	 * InMemoryUserDetailsManager(ud); }
	 */ 
	   
}
