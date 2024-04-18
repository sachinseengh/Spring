package com.springcore.primitive;

public class Student {
	
	public int id;
	public String name;
	public String address;
	
	
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public void setName(String name) {
		System.out.println("Name");
		this.name=name;
	}
	public String getName() {
	
		return this.name;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return this.address;
	}

}
