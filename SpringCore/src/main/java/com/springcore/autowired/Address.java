package com.springcore.autowired;

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
		return "Address [city=" + city + ", address=" + state + "]";
	}
	public void setState(String address) {
		this.state = address;
	}
	
}
