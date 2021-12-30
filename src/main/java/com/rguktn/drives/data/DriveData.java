package com.rguktn.drives.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document
public class DriveData implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String name;
	private String location;
	private String desc;
	private String websitelink;
	private List<String> addresses;
	private EligibilityData eligibilityData;
	private Map<String, String> selectionCriteria;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@CreatedDate
	private Date createdDate;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@LastModifiedDate
	private Date updatedDate;

	private Long createdBy = 1L;
	
	private Long updatedBy = 1L;
	
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public Long getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getWebsitelink() {
		return websitelink;
	}
	public void setWebsitelink(String websitelink) {
		this.websitelink = websitelink;
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	public EligibilityData getEligibilityData() {
		return eligibilityData;
	}
	public void setEligibilityData(EligibilityData eligibilityData) {
		this.eligibilityData = eligibilityData;
	}
	public Map<String, String> getSelectionCriteria() {
		return selectionCriteria;
	}
	public void setSelectionCriteria(Map<String, String> selectionCriteria) {
		this.selectionCriteria = selectionCriteria;
	}
	
	
}
