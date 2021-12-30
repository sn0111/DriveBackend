package com.rguktn.drives.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rguktn.drives.data.UserData;
import com.rguktn.drives.repository.UserRepository;

@Component
public class UserDAO {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserData findByUserId(String userId) {
		return userRepository.findByUserId(userId);
	}

	public UserData saveUser(UserData userData) {
		return userRepository.save(userData);
	}

}
