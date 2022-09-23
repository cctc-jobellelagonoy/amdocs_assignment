package com.training.exam1.Task1;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private String courseID, name;
	private List<Student> students;
	
	public Course(String courseID, String name) {
		students = new ArrayList<>();
		this.courseID = courseID;
		this.name = name;
	}

	public String getCourseID() {
		return courseID;
	}

	public String getName() {
		return name;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
}
