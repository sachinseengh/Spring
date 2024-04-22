package com.springcore.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/annotation/Config.xml");
		
		
		Student s= context.getBean("st",Student.class);
		System.out.println(s);

	}

}
