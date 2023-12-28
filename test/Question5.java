package com.jbk.test;
//5.	Check whether a year is Leap Year or not.	
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year :");
		int year=sc.nextInt();
		
		boolean leap=(year%4==0&&year%100!=0)||year%400==0;
		
		if(leap) {
			System.out.println(year+ " is leap year......");
			
		}
		else {
			System.out.println(year+" is Not a leap year.....");
		}
		
		
	}

}
