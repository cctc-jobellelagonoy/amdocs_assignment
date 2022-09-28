package com.training.assignment08.Task1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Colleges colleges = new Colleges();
		
		colleges.addCollege("Harvard University", Arrays.asList(new Student("John"), new Student("Michelle"), new Student("Micha"), new Student("Michael")));
		colleges.addCollege("UCLA", Arrays.asList(new Student("Kevin"), new Student("David"), new Student("Jane"), new Student("Jake")));
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your college: ");
		String college = in.nextLine();
		
		try {
			List<Student> students = colleges.getStudents(college);
			for(Student stud: students) {
				System.out.println(stud.getName());
			}
		}
		catch(NullPointerException e) {
			System.out.println("There is no college of that name.");
		}
	}
}