package com.slokam.hr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao extends JpaRepository<UserDetailsImpl, Long> {

	 public abstract UserDetailsImpl findByUsername(String username);
	
	 // select r.name from user u join  user_role ur on u.id = ur.uid
	 //  join role r on ur.rid = r.id where u.name=?
	 @Query("select a from UserDetailsImpl u "
	 		+ "join u.authorities a where u.username=?1")
	 public abstract List<GrantedAuthorityImpl> getRolesByUserName(String username);

	 	
}
