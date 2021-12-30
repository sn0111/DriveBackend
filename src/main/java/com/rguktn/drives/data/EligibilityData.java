package com.rguktn.drives.data;

import java.io.Serializable;
import java.util.List;

public class EligibilityData implements Serializable {

	private static final long serialVersionUID = 1L;
	private String primary;
	private String secondary;
	private String degree;
	private List<String> branches;
	private String yearOfPass;
	private String joiningLocation;
	private Boolean training;
	private String stipend;
	private String ppoOffer;
	private String jobPosition;
	private String jobNature;
	private String bond;
	private String desc;
	
	public String getPrimary() {
		return primary;
	}
	public void setPrimary(String primary) {
		this.primary = primary;
	}
	public String getSecondary() {
		return secondary;
	}
	public void setSecondary(String secondary) {
		this.secondary = secondary;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public List<String> getBranches() {
		return branches;
	}
	public void setBranches(List<String> branches) {
		this.branches = branches;
	}
	public String getYearOfPass() {
		return yearOfPass;
	}
	public void setYearOfPass(String yearOfPass) {
		this.yearOfPass = yearOfPass;
	}
	public String getJoiningLocation() {
		return joiningLocation;
	}
	public void setJoiningLocation(String joiningLocation) {
		this.joiningLocation = joiningLocation;
	}
	public Boolean getTraining() {
		return training;
	}
	public void setTraining(Boolean training) {
		this.training = training;
	}
	public String getStipend() {
		return stipend;
	}
	public void setStipend(String stipend) {
		this.stipend = stipend;
	}
	public String getPpoOffer() {
		return ppoOffer;
	}
	public void setPpoOffer(String ppoOffer) {
		this.ppoOffer = ppoOffer;
	}
	public String getJobPosition() {
		return jobPosition;
	}
	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}
	public String getJobNature() {
		return jobNature;
	}
	public void setJobNature(String jobNature) {
		this.jobNature = jobNature;
	}
	public String getBond() {
		return bond;
	}
	public void setBond(String bond) {
		this.bond = bond;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
