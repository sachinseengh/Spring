package com.springcore.reference;

public class Student {
	private String name;
	
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
