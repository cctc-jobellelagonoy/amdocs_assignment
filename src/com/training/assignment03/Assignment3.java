package com.training.assignment03;


import java.util.Arrays;

//3. Create an array of 5 Employees and sort them based on their years of experience. 
public class Assignment3 {

	public static void main(String[] args) {
		Employee[] employees = {
				new Employee(6),
				new Employee(4),
				new Employee(5),
				new Employee(3),
				new Employee(7)
		};
		
		Arrays.sort(employees, (a,b) -> a.experience.compareTo(b.experience));
		
		for(Employee emp : employees) {
			System.out.println(emp.getExperience());
		}
	}
}

class Employee{
	Integer experience;

	public Employee(Integer experience) {
		this.experience = experience;
	}
	
	public Integer getExperience() {
		return experience;
	}
}
 