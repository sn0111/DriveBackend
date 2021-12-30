package com.rguktn.drives.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rguktn.drives.data.DriveData;
import com.rguktn.drives.repository.DriveRepository;

@Component
public class DriveDAO {
	
	@Autowired
	private DriveRepository driveRepository;
	
	public DriveData saveDrive(DriveData driveData) {
		return driveRepository.save(driveData);
	}
	
	public Optional<DriveData> findDrive(String id){
		return driveRepository.findById(id);
	}
	
	public List<DriveData> allDrives(){
		return driveRepository.findAll();
	}

}
