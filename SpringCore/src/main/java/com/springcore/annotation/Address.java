package com.springcore.annotation;

public class Address {

	private String city;
	private String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", city =" + state + "]";
	}
	public void setState(String address) {
		this.state = address;
	}
	
}
