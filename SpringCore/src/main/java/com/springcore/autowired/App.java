package com.springcore.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowired/Config.xml");
		
		
		Student s= context.getBean("st",Student.class);
		System.out.println(s);

	}

}
