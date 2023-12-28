package com.jbk.test;

import java.util.Scanner;
//7.	Write a program in Java to display the multiplication table of a given integer.	
public class Question7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		int cal;
		for(int i=1;i<=10;i++) {
			cal=num*i;
		
		System.out.println(num+"*"+i+"="+cal);
		}
	}

}
