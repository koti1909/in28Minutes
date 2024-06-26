package com.java.oops2.inheritance;

public class Employee extends Person {
	
	private String title;
	private String employer;
	private int grade;
	private String salary;
	
	public Employee(String name, String title) {
		super(name);
		this.title= title;	
		System.out.println("Employee Constructor");
		}
		
	public String getTitle() {
		return title;
	}
	
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int i) {
		this.grade = i;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Name: " + getName() + " | " + "Title: " + getTitle() + " | " + "Employer: " + getEmployer() + " | " + "Grade: " + getGrade() + " | " + "E-mail: " + getEmail() + " | ";
	}
}
