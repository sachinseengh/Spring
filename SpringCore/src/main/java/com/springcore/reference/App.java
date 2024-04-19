package com.springcore.reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/Config.xml");

	
	Student s1 = context.getBean("st",Student.class);
	System.out.println(s1.getAddress().getCity());
	System.out.print(s1.getName());
		
	}
	}
