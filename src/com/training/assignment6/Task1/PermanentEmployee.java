package com.training.assignment6.Task1;

public class PermanentEmployee implements Employee {

	private double basicSalary;
	
	public PermanentEmployee() {
		super();
	}

	public void setSalary(double salary) {
		this.basicSalary = salary;
	}
	
	@Override
	public double getSalary() {
		return (basicSalary - (basicSalary*0.12));
	}

	@Override
	public double getLoanAmount() {
		return (basicSalary*0.15);
	}

}
