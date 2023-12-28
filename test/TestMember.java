package com.jbk.test;

public class TestMember {

	public static void main(String[] args) {
		Employee e1=new Employee("Rahul", 30,"9568945416" , "Pune", 20000,"Data Science","Big data");
		
		Manager m1=new Manager("Tina",31, "8585956535","Mumbai", 30000);
		
		
		System.out.println("Employee Deatils :");
		System.out.println("Name of employee is :"+e1.name);
		System.out.println("Age of employee is :"+e1.age);
		System.out.println("Contact no. of employee is :"+e1.phone_no);
		System.out.println("Address of employee is :"+e1.address);
		System.out.println("The department of the employee is :"+e1.department);
		System.out.println("The specialaization of employee is :"+e1.specialization);
		e1.printSalary();
		System.out.println("-----------------------");
		System.out.println("Manager Deatils :");
		System.out.println("Name of manager is :"+m1.name);
		System.out.println("Age of manager is :"+m1.age);
		System.out.println("Contact no. of manager is :"+m1.phone_no);
		System.out.println("Address of manager is :"+m1.address);
		m1.printSalary();
	}

}
