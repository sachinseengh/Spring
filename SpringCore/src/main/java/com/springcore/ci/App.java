package com.springcore.ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/ci/Config.xml");
		
		Student s1= context.getBean("ad",Student.class);
		System.out.print(s1);

	}

}
