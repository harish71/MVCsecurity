package com.slokam.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
//Changes by user 1
@Service
public class LoginService implements ILoginService {
	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;
	
	@Autowired
	private LoginDao loginDao;
	@Override
	public void saveUser(UserDetailsImpl user) {
		 String encodedPassword = bcryptPasswordEncoder.encode(user.getPassword());
		 user.setPassword(encodedPassword);
		 loginDao.save(user);
	}
	
}
