package com.springcore.crud;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

	public static void main(String[] args) throws SQLException {
		

		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		
//		JdbcTemplate jd = context.getBean("jdbc",JdbcTemplate.class);
//		System.out.println(jd.getDataSource().getConnection());
//		
		
	    StudentDaoimpl st = new StudentDaoimpl();
	    
	

}
	}
