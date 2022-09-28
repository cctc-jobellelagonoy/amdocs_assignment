package com.training.assignment04.Task1;

public class EmployeeType {
	
	public static Employee getType(String type) {
		if(type.equals("Permanent")) {
			return new PermanentEmployee();
		}
		else if(type.equals("Contractual")) {
			return new ContractualEmployee();
		}
		return null;
	}
}
