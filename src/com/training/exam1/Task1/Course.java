package com.training.exam1.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

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
		Collections.sort(students);
		return students;
	}
	
	public void addStudent(Student student) throws ExistingStudentException {
		
		try {
			Student s = students.stream().filter(a -> a.getStudentID().equals(student.getStudentID())).findFirst().get();
			throw new ExistingStudentException();
		}
		catch(NoSuchElementException e) {
			students.add(student);
		}
	}
	
}
