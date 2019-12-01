package com.slokam.hr;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<UserDetailsImpl> {

	@Override
	public UserDetailsImpl mapRow(ResultSet rs, int arg1) throws SQLException {
		UserDetailsImpl ud = new UserDetailsImpl();
		ud.setUsername(rs.getString("user"));
		ud.setPassword("{noop}"+rs.getString("password"));
		ud.setCredentialsNonExpired(rs.getBoolean("credtialsNonexp"));
		ud.setAccountNonExpired(rs.getBoolean("accnonexp"));
		ud.setAccountNonLocked(rs.getBoolean("accnonlocked"));
		ud.setEnabled(rs.getBoolean("enabled"));
		return ud;
	}
}
