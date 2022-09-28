package com.training.exam01.Task2;

public class Contact {
	private String name, number;

	public Contact(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	} 
	
	public boolean equals(Contact c) {
		if(this.number.equals(c.getNumber())) {
			return true;
		}
		else return false;
	}
}
