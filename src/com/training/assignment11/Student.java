package com.training.assignment11;

public class Student {

	private String studId;
	private String studName;
	private String address;
	private String department;
	
	public String getStudId() {
		return studId;
	}
	public String getStudName() {
		return studName;
	}
	public String getAddress() {
		return address;
	}
	public String getDepartment() {
		return department;
	}
	public void setStudId(String studId) {
		this.studId = studId;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Student(String studId, String studName, String address, String department) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.address = address;
		this.department = department;
	}
	
	
}
