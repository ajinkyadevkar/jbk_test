package com.jbk.test;

public class Employee extends Member{
	String specialization;
	String department;
	
	public Employee(String name, int age, String phone_no, String address, double salary,String specialization,String department) {
		super(name, age, phone_no, address, salary);
		this.specialization=specialization;
		this.department=department;
	}
	
	

}
