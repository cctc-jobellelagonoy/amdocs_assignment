package com.training.assignment06.Task1;

public class ContractualEmployee implements Employee {

	private double basicSalary;
	
	public ContractualEmployee() {
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
		return (basicSalary*0.10);
	}
}
