package com.spring.annotationbased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	
	
//	Emp em = context.getBean("emp",Emp.class);
	
	
	Emp em = context.getBean("getEmp",Emp.class);
    
	System.out.print(em);
	}
	
}
