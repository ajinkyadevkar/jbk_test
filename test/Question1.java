package com.jbk.test;

import java.util.Scanner;

//1.	Write a program in Java to display the cube of the number up to a given an integer.
public class Question1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		int c=a*a*a;
		System.out.println("The cube of given number is: "+c);
		
	}

}
