package com.springcore.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/beanlifecycle/Config.xml");
		
            Student student=context.getBean("st",Student.class);
            System.out.println(student);
	}

}
