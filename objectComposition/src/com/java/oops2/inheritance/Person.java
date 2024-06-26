package com.java.oops2.inheritance;

public class Person extends Object {
	
	private String name;
	private String phone;
	private String email;
	
	public Person(String name) {
		this.name = name;
		System.out.println("Person Constructor");
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
