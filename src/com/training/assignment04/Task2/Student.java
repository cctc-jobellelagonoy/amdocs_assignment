package com.training.assignment04.Task2;

public class Student {
	protected int hostelNo, roomNo, regNo;
	protected String department;
	
	public Student(int hostelNo, int roomNo, int regNo, String department) {
		this.hostelNo = hostelNo;
		this.roomNo = roomNo;
		this.regNo = regNo;
		this.department = department;
	}
	
	public void getDetails() {
		System.out.println("Hostel No: "+hostelNo);
		System.out.println("Room No: "+roomNo);
		System.out.println("Registration No: "+regNo);
		System.out.println("Department: "+department);
		System.out.println();
	}
}
