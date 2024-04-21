package com.springcore.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
	AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/beanlifecycle/Config.xml");
		
	         context.registerShutdownHook();
            Student student=context.getBean("st",Student.class);
            System.out.println(student);
	}

}
