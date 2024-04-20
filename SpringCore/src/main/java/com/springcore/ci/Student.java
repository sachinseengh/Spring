package com.springcore.ci;

public class Student {

	
	private int id;
	private String name;
	
//	public Student(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//		System.out.println("Name :" +name);
//	}
	public Student( String name,int id) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Name :" +name);
	}
	
	
	
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + "]";
//	}
	
	
}
