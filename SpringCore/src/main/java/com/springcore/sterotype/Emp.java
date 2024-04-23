package com.springcore.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// it we use it use have to use snake case
//@Component

@Component("employee")
@Scope("prototype")


public class Emp {

	
	
	@Value("5")
	private int id;
	private String name;
	
	
	@Value("#{ad}")
	private List<String> address;
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
