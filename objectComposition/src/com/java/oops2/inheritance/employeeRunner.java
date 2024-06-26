package com.java.oops2.inheritance;

public class employeeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee("Koti", "Human");
		
		employee1.setEmail("koti@paruchuri.com");
		
		employee1.setEmployer("God");
		
		employee1.setGrade(1);
		
		employee1.setSalary("$ laksha kotlu");
		
		
		System.out.println(employee1.toString());
	}

}
