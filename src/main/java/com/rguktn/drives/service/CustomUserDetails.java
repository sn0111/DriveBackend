package com.rguktn.drives.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.rguktn.drives.data.RoleData;
import com.rguktn.drives.data.UserData;

public class CustomUserDetails implements UserDetails {

	private UserData userData;
	
	public CustomUserDetails(UserData userData) {
		this.userData=userData;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<RoleData> roles = userData.getRoles();
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        
        for (RoleData role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
	}

	@Override
	public String getPassword() {
		return userData.getPassword();
	}

	@Override
	public String getUsername() {
		return userData.getUserId();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
