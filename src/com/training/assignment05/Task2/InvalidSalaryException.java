package com.training.assignment05.Task2;

public class InvalidSalaryException extends Exception{
	
	private String message;
	
	public InvalidSalaryException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}