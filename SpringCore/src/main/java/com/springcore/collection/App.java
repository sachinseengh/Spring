package com.springcore.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/Config.xml");

		
		Student s1= context.getBean("std1",Student.class);
		System.out.print(s1);
	}

}
