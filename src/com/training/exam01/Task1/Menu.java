package com.training.exam01.Task1;

import java.util.Scanner;

public class Menu {
	
	Scanner input;
	
	public Menu() {
		input = new Scanner(System.in);
	}
	
	public int getMenu() {
		System.out.println("\nEnrolment Management");
		System.out.println("---------------------------");
		System.out.println("[1] Add Course");
		System.out.println("[2] Create Student");
		System.out.println("[3] Enrol Student");
		System.out.println("[4] View Course Details");
		System.out.println("[5] View Students by Course");
		System.out.println("[6] Exit");
		System.out.println("---------------------------");
		System.out.print("Enter n: ");
		
		int n = 0;
		try {
			n = Integer.parseInt(input.nextLine());
		}
		catch(Exception e) {
			System.out.println("Invalid Input.");
		}
		
		return n;
	}

	public Course createCourse() {
		System.out.println("\n-----Create-New-Course-----");
		System.out.print("Enter course ID: ");
		String cid = input.nextLine();
		
		System.out.print("Enter course name: ");
		String cname = input.nextLine();
		
		return new Course(cid, cname);
	}

	public Student createStudent() {
		System.out.println("\n----Create-New-Student-----");
		System.out.print("Enter student ID: ");
		String sid = input.nextLine();
		
		System.out.print("Enter student name: ");
		String sname = input.nextLine();
		
		return new Student(sid, sname);
	}
	
	public String getExistingStudentID() {
		System.out.print("Enter student ID: ");
		String sID = input.nextLine();
		
		return sID;
	}

	public String getExistingCourseID() {
		System.out.print("Enter course ID: ");
		String cID = input.nextLine();
		
		return cID;
	}
}
