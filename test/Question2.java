package com.jbk.test;
import java.util.Scanner;
//2.	Find a Factorial of a number.
public class Question2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		
		int fact=1;
		for(int i=num;i>0;i--) {
			fact=fact*i;
		}
		System.out.println("The factorial of given number is : "+fact);
	}

}
