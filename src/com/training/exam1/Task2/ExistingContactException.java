package com.training.exam1.Task2;

public class ExistingContactException extends Exception{
	private String message;
	public ExistingContactException() {
		this.message = "This contact is already in the phonebook.";
	}
	
	public String getMessage() {
		return message;
	}
}
