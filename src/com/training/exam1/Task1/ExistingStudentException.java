package com.training.exam1.Task1;

public class ExistingStudentException extends Exception{

	private String message;
	public ExistingStudentException() {
		this.message = "This student is already enrolled in this course.";
	}
	
	public String getMessage() {
		return message;
	}
}
