package com.training.assignment07.Task1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

	public static void main(String[] args) {
		Map<String, Student> students = new HashMap<>();

		students.put("S01", new Student("S01", "John"));
		students.put("S02", new Student("S02", "Sarah"));
		students.put("S03", new Student("S03", "Sally"));
		students.put("S04", new Student("S04", "Kevin"));
		students.put("S05", new Student("S05", "Daisy"));
		
		students.entrySet()
				.stream()
				.filter(s -> s.getValue().getName().charAt(0) == 'S')
				.forEach(e -> System.out.println(e.getValue().getName()));
	}

}
