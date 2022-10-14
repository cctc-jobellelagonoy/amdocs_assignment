package com.training.assignment16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
		
		ApplicationContext javaContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		Employee emp = (Employee) context.getBean("employee");
		
		Employee emp1 = (Employee) javaContext.getBean(Employee.class);
		
		System.out.println(emp1.getEmployeeDetails());
	}

}
