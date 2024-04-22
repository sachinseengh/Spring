package com.springcore.sterotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// it we use it use have to use snake case
//@Component

@Component("employee")


public class Emp {

	
	
	@Value("5")
	private int id;
	private String name;
	
	
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
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
}
