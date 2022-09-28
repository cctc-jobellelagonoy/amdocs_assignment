package com.training.assignment06.Task1;

import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public class Colleges {
	HashMap<String, List<Student>> colleges;
	
	public Colleges() {
		colleges = new HashMap<>();
	}
	
	public void addCollege(String name, List<Student> students) {
		colleges.put(name, students);
	}
	
	public List<Student> getStudents(String name) throws NullPointerException{
		try {
			return colleges.get(name);
		}
		catch(NullPointerException e) {
			throw e;
		}
	}
}
