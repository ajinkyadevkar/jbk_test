package com.jbk.test;
//3.	Create a class named 'Member' having the following members:
//Data members
//1 - Name
//2 - Age
//3 - Phone number
//4 - Address
//5 - Salary
//It also has a method named 'printSalary' which prints the salary of the members.
//Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.

public class Member {
	String name;
	int age;
	String phone_no;
	String address;
	double salary;
	
	public Member(String name, int age, String phone_no, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phone_no = phone_no;
		this.address = address;
		this.salary = salary;
	}

	void printSalary() {
		System.out.println("The salary of the employee is "+salary);
	}
}
