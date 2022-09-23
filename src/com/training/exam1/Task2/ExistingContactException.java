package com.training.exam1.Task2;

public class ExistingContactException extends Exception{
	private String message;
	public ExistingContactException() {
		this.message = "This number is used by another contact.";
	}
	
	public String getMessage() {
		return message;
	}
}
