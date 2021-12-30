package com.rguktn.drives.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rguktn.drives.data.DriveData;
import com.rguktn.drives.service.DriveService;

@RestController
@RequestMapping("/api/drive")
public class DriveController {
	
	@Autowired
	private DriveService driveService;
	
	@PostMapping("/save")
	public DriveData saveDrive(@RequestBody DriveData driveData) {
		return driveService.saveDrive(driveData);
	}
	
	@PutMapping("/update/{id}")
	public DriveData updateDrive(@RequestBody DriveData driveData,@RequestParam(name = "id") String id) {
		return driveService.updateDrive(driveData, id);
	}
	
	@GetMapping("/{id}")
	public DriveData findDrive(@RequestParam(name = "id") String id) {
		return driveService.findDrive(id);
	}
	
	@GetMapping("/all")
	public List<DriveData> findAllDrives(){
		return driveService.findAllDrives();
	}
}
