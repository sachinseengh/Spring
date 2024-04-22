package com.springcore.sterotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/sterotype/Config.xml");

         Emp em = context.getBean("employee",Emp.class);
         System.out.print(em);
	}

}
