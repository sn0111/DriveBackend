package com.rguktn.drives.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rguktn.drives.data.UserData;
import com.rguktn.drives.service.UserService;
import com.rguktn.drives.util.JwtUtil;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtil jwt;
	
	@PostMapping
	public UserData saveUser(@RequestBody UserData userData) {
		return userService.saveUser(userData);
	}
	
	@PostMapping("/login")
	public String userLogin(@RequestBody UserData userData) throws Exception{
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userData.getUserId(), userData.getPassword()));
		}catch (Exception e) {
			throw new Exception("Invalid Password");
		}
		return jwt.generateToken(userData.getUserId());
	}
}
