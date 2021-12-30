package com.rguktn.drives;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.rguktn.drives.data.UserData;
import com.rguktn.drives.service.UserService;

@SpringBootApplication
public class BackendApplication {
	
	@Autowired
	private UserService userService;
	
	
	
//	@PostConstruct
//	public UserData saveUser() {
//		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//		UserData userData = new UserData();
//		userData.setUserId("N160096");
//		userData.setPassword(bCryptPasswordEncoder.encode("b0d0f"));
//		userData.setUserEmail("N160096@rguktn.ac.in");
//		return userService.saveUser(userData);
//	}

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
