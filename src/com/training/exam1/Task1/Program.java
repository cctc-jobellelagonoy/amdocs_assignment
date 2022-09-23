package com.training.exam1.Task1;

import java.util.HashMap;
import java.util.List;

public class Program {
	private HashMap<String, Course> curriculum;
	private HashMap<String, Student> students;
	
	public Program() {
		curriculum = new HashMap<>();
		students = new HashMap<>();
	}
	
	public HashMap getCourses() {
		return curriculum;
	}
	
	public void addCourse(Course course) {
		curriculum.put(course.getCourseID(), course);
	}
	
	public void addStudent(Student student) {
		students.put(student.getStudentID(), student);
	}
	
	public HashMap getStudents() {
		return students;
	}
	
	public Course getCourseByID(String courseID) {
		return curriculum.get(courseID);
	}
	
	public Student getStudentByID(String studentID) {
		return students.get(studentID);
	}
}
