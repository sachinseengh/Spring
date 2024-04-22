package com.springcore.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

    @Autowired
	
	@Qualifier("arko")
	private Address address;


	

//	public Student(Address address) {
//		super();
//		this.address = address;
//		
//		System.out.println("constructor hu main");
//	}

	

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("setter hu main");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
}
