package com.training.assignment10;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student("John", 'A'));
		students.add(new Student("Mary", 'C'));
		students.add(new Student("Sara", 'F'));
		students.add(new Student("Jane", 'A'));
		
		Collections.sort(students, (a, b)->a.getName().compareTo(b.getName()));
		
		students.forEach(s -> System.out.println(s.getName()+" - "+s.getGrade()));
	}

}
