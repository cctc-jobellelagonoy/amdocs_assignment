package com.training.assignment10;

import java.util.ArrayList;
import java.util.Comparator;

public class Task2 {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student("John", 'A'));
		students.add(new Student("Mary", 'C'));
		students.add(new Student("Sara", 'F'));
		students.add(new Student("Kane", 'A'));
		students.add(new Student("Assi", 'A'));
		
		students.stream()
				.filter(s -> s.getGrade().equals('A'))
				.sorted(Comparator.comparing(Student::getName))
				.forEach(s -> System.out.println(s.getName()+" - "+s.getGrade()));
	}
}
