package com.training.assignment12.Task2;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_test")
public class Student {
	
	@Id
	@Column(name="stud_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studID;
	
	@Column(name="stud_name")
	private String studName;
	
	@Column(name="stud_grade")
	private String grade;

	public Student(String studName, String grade) {
		super();
		this.studName = studName;
		this.grade = grade;
	}

	public int getStudID() {
		return studID;
	}

	public void setStudID(int studID) {
		this.studID = studID;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Student() {
		super();
	}

	

}
