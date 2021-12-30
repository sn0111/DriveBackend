package com.rguktn.drives.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rguktn.drives.data.UserData;

public interface UserRepository extends MongoRepository<UserData, String>{
	public UserData findByUserId(String userId);
}
