package com.rguktn.drives.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rguktn.drives.data.DriveData;

@Repository
public interface DriveRepository extends MongoRepository<DriveData, String> {

}
