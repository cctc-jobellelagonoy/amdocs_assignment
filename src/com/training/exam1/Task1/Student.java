package com.training.exam1.Task1;

public class Student implements Comparable<Student>{
	private String studentID, name;

	public Student(String studentID, String name) {
		super();
		this.studentID = studentID;
		this.name = name;
	}

	public String getStudentID() {
		return studentID;
	}

	public String getName() {
		return name;
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
	
}
