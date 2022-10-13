package com.training.assignment16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationConfig.xml");

		Employee emp = (Employee) context.getBean("employee");
		
		System.out.println(emp.getEmployeeDetails());
	}

}
