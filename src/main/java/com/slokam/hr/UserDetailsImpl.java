package com.slokam.hr;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.userdetails.UserDetails;
@Entity
@Table(name="users")
public class UserDetailsImpl implements UserDetails{

	@Id
	@GeneratedValue
	private Long id;
	private String password;
	private String username;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private boolean enabled;
    
   
    // 1. reference.
    // 2. relation ship
    // 3. joinColumn/Join Table
    @ManyToMany
    @JoinTable( name="user_role",
                joinColumns = { 
                		@JoinColumn(name="uid")
                },
                inverseJoinColumns = {
                		@JoinColumn(name="rid")
                }
    		)
    private Collection< GrantedAuthorityImpl > authorities;
    
	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setAuthorities(Collection<GrantedAuthorityImpl> authorities) {
		this.authorities = authorities;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return this.accountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return this.accountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		return this.enabled;
	}
	@Override
	public Collection< GrantedAuthorityImpl > getAuthorities() {
		return this.authorities;
	}
	
}
