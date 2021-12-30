package com.rguktn.drives.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rguktn.drives.dao.DriveDAO;
import com.rguktn.drives.data.DriveData;

@Service
public class DriveService {

	@Autowired
	private DriveDAO driveDAO;
	
	public DriveData saveDrive(DriveData driveData) {
		return driveDAO.saveDrive(driveData);
	}
	
	public DriveData updateDrive(DriveData driveData,String id) {
		Optional<DriveData> optionalDrive = driveDAO.findDrive(id);
		if(optionalDrive.isPresent()) {
			driveData.setId(optionalDrive.get().getId());
			return driveDAO.saveDrive(driveData);
		}else {
			return null;
		}
	}
	
	public DriveData findDrive(String id) {
		Optional<DriveData> optionalDrive = driveDAO.findDrive(id);
		if(optionalDrive.isPresent()) {
			return optionalDrive.get();
		}else {
			return null;
		}
	}
	
	public List<DriveData> findAllDrives(){
		return driveDAO.allDrives();
	}
}
