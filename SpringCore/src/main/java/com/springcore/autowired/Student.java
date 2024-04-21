package com.springcore.autowired;

public class Student {

	private Address address;
	private String name;

	public String getName() {
		return name;
	}

	public Student(Address address) {
		super();
		this.address = address;
		
		System.out.println("constructor hu main");
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + ", name=" + name + "]";
	}
	
}
