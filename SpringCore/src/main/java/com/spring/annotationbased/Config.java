package com.spring.annotationbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.annotationbased")
public class Config {

	@Bean
	public Address address() {
		return new Address();
	}
	
	
	
	@Bean
	public Emp getEmp() {
		return new Emp();
	}
}
