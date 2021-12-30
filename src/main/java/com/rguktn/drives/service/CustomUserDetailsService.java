package com.rguktn.drives.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rguktn.drives.data.UserData;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		UserData userData = userService.findByUserId(userId);
		if(userData == null) {
			throw new UsernameNotFoundException("Could not found with userId");
		}
//		return new CustomUserDetails(userData);
		return new User(userData.getUserId(),userData.getPassword(),new ArrayList<>());
	}

}
