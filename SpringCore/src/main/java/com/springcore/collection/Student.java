package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private String name;
	private List<String> address;
	
	private Map<String,String> course;
	private Set<String> phone;
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", course=" + course + ", phone=" + phone + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
	   return this.name;
	}
	
	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}
	
	public Set<String> getPhone() {
		return this.phone;
	}
	
	public void setAddress(List<String> address) {
		this.address= address;
		
	}
	
	public List<String> getAddress() {

		return this.address;
	}
	public void setCourse(Map<String,String> course) {
		this.course = course;
		
	}
	public Map<String,String> getCourse(){
		return this.course;
	}
	
	
}