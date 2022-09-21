package com.training.assignment6.Task1;

public class Main {

	public static void main(String[] args) {
		Employee permanent = EmployeeType.getType("Permanent");
		Employee contractual = EmployeeType.getType("Contractual");
		
		permanent.setSalary(50000);
		contractual.setSalary(50000);
		
		System.out.println("Permanent | Salary = "+permanent.getSalary());
		System.out.println("Permanent | Loan Amount = "+permanent.getLoanAmount());
		System.out.println("Contractual | Salary = "+contractual.getSalary());
		System.out.println("Contractual | Loan Amount = "+contractual.getLoanAmount());

	}

}
