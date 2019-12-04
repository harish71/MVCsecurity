package com.slokam.hr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
//Changes by user 1
// changes by user2

@Service
public class LoginService implements ILoginService {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginService.class);
	
	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;
	
	@Autowired
	private LoginDao loginDao;
	@Override
	public void saveUser(UserDetailsImpl user) {
		 LOGGER.trace("Entred into saveUser");
		 String encodedPassword = bcryptPasswordEncoder.encode(user.getPassword());
		 user.setPassword(encodedPassword);
		 loginDao.save(user);
		 LOGGER.trace("Exit from saveUser");
	}
	
}
