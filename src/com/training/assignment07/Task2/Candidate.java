package com.training.assignment07.Task2;

public class Candidate{
	private String name, gender;
	private int expectedSalary;
	
	public Candidate(String name, String gender, int salary) throws InvalidSalaryException {
		if(salary<10000) {
			throw new InvalidSalaryException("Salary cannot be less than 10000");
		}
		else {
			this.name = name;
			this.gender = gender;
			this.expectedSalary = salary;
		}
	}
	
	public void print() {
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("ExpectedSalary: "+expectedSalary);
	}
}
