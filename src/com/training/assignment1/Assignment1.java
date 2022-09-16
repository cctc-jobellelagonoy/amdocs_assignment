package com.training.assignment1;

public class Assignment1 {
	
	public static void main( String[] args )
    {
        Student stud1 = new Student("Jane", 15, 1, 80);
        Student stud2 = new Student("Harry", 16, 2, 50);
        Student stud3 = new Student("James", 15, 3, 20);
        Student stud4 = new Student("John", 16, 4, 25);
        Student stud5 = new Student("Ethan", 17, 5, 90);     
    }
}

class Student{
	private String name;
	private int age;
	private int rollno;
	private int marks;
	
	public Student(String name, int age, int rollno, int marks) {
		if(marks < 30) {
			System.out.println("Marks less than 30 cannot be accepted.");
		}else {
			this.marks = marks;
			this.name = name;
			this.age = age;
			this.rollno = rollno;
		}
	}
	
	
}

//1. Initialize five Student objects using constructor having properties 
//like name, age, roll No, marks, if someone tries to put in marks 
//less than 30 then application should show a message: “Marks less than 30 cannot
//be accepted”. 
