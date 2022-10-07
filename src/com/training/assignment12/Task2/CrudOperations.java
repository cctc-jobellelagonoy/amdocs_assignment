package com.training.assignment12.Task2;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.training.assignment12.Task2.Student;

public class CrudOperations {
	
	EntityManagerFactory studFactoryObj;
	EntityManager entity;
	
	CrudOperations(){
		studFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		entity = studFactoryObj.createEntityManager();
		entity.getTransaction().begin();
	}
	
	public void insertEntity(String name, String grade) {
		Student s=new Student(name, grade);
		entity.persist(s);
		entity.getTransaction().commit();
	}
	
	public void updateEntity(String grade, int ID) {		
		Student stud = entity.find(Student.class, ID);
		
		stud.setGrade(grade);
		entity.getTransaction().commit();
	}
	
	public void findEntity(String grade) {
		entity = studFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		List<Student> results = entity.createQuery("select c from Student c where c.grade LIKE :grade")
				.setParameter("grade", grade)
			    .getResultStream()
			    .toList();
			    
		results.stream().forEach(s -> System.out.println(s.getStudID()+" : "+s.getStudName()+" : "+s.getGrade()));
	}
	
	public void removeEntity(String grade) {
		int deleted = entity.createQuery("delete Student where grade = :g")
								.setParameter("g", grade).executeUpdate();
		
		entity.getTransaction().commit();
	}

}
