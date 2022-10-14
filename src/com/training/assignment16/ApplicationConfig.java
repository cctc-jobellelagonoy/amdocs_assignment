package com.training.assignment16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean
	public Employee employee() {
		Employee emp = new Employee();
		emp.setName("Jobelle");
		
		
		return emp;
	}
}
