package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
	@Value("#{1+1}")
	private int sum;
	
	@Override
	public String toString() {
		return "Student [sum=" + sum + ", divide=" + divide + ", result=" + result + "]";
	}

	@Value("#{5/2}")
	private int divide;
	
	public static void call() {
		System.out.println("MEthod calling");
		}
		
	@Value("#{T(com.springcore.spel.Student).call()}")
	private String result;

}
