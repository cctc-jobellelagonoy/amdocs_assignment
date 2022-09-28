package com.training.assignment05.Task2;

public class Main2 {

	public static void main(String[] args) {
		try {
			Candidate c = new Candidate("John", "Male", 99000);
			c.print();
			
		} catch (InvalidSalaryException e) {
			System.out.print(e.getMessage());
		}
	}
}
