package com.springcore.JDBC;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

	public static void main(String[] args) throws SQLException {
		

		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		
		JdbcTemplate jd = context.getBean("jdbc",JdbcTemplate.class);
		System.out.println(jd.getDataSource().getConnection());
		
		
		String sql ="insert into spring values (?,?)";
		
		int i = jd.update(sql,"1","sachin");
		
		System.out.print("succesfully inserted : " + i );

}
	}
