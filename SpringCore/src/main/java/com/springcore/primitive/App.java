package com.springcore.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	
		ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/primitive/Config.xml");
	
	Student s1=context.getBean("std1",Student.class);
	System.out.println(s1);
	
	Student s2=context.getBean("std2",Student.class);
	System.out.println(s2);
	
	}

}
