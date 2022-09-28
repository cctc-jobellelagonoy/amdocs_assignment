package com.training.exam01.Task1;

import java.util.HashMap;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Program curriculum = new Program();
		
		Menu menu = new Menu();
		int choice = 0;
		
		while(choice != 6) {
			choice = menu.getMenu();
			
			if(choice == 1) {
				Course newCourse = menu.createCourse();
				curriculum.addCourse(newCourse);
				System.out.println("\nCourse Created Successfully");
			}
			else if(choice == 2) {
				Student newStudent = menu.createStudent();
				curriculum.addStudent(newStudent);
				System.out.println("\nStudent Created Successfully");
			}
			else if(choice == 3) {
				System.out.println("\n---Enrol-Student-Course----");
				Student student = curriculum.getStudentByID(menu.getExistingStudentID());
				Course course = curriculum.getCourseByID(menu.getExistingCourseID());
				if(isStudentValid(student, curriculum) && isCourseValid(course, curriculum)) {
					try {
						course.addStudent(student);
						System.out.println(student.getName()+" was successfully enrolled in "+course.getName());
					}
					catch(ExistingStudentException e) {
						System.out.println(e.getMessage());
					}
				}
			}
			else if(choice == 4) {
				Course course = curriculum.getCourseByID(menu.getExistingCourseID());
				
				if(isCourseValid(course, curriculum)) {
					System.out.println("\n------Course-Details-------");
					System.out.println("Course ID: "+course.getCourseID());
					System.out.println("Course name: "+course.getName());
					System.out.println("Students: ");
					
					for(Student s : course.getStudents()) {
						System.out.println(s.getStudentID()+" - "+s.getName());
					}
				}
			}
			else if(choice == 5) {
				Course course = curriculum.getCourseByID(menu.getExistingCourseID());
				
				if(isCourseValid(course, curriculum)) {
					List<Student> list = course.getStudents();
					System.out.println("Students: ");
					
					for(Student s : course.getStudents()) {
						System.out.println(s.getStudentID()+" - "+s.getName());
					}
				}
			}
		}
		System.out.println("Program closed.");
	}
	
	public static Boolean isCourseValid(Course course, Program c) {
		try {
			c.getCourseByID(course.getCourseID()).getCourseID();
			return true;
		}
		catch(NullPointerException e) {
			System.out.println("Non-existent course!");
			return false;
		}
	}
	
	public static Boolean isStudentValid(Student s, Program c) {
		try {
			c.getStudentByID(s.getStudentID());
			return true;
		}
		catch(NullPointerException e) {
			System.out.println("Non-existent student!");
			return false;
		}
	}
}
