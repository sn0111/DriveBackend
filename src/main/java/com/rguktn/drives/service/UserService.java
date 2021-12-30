package com.rguktn.drives.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rguktn.drives.dao.UserDAO;
import com.rguktn.drives.data.UserData;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	public UserData findByUserId(String userId) {
		return userDAO.findByUserId(userId);
	}

	public UserData saveUser(UserData userData) {
		return userDAO.saveUser(userData);
	}
}
