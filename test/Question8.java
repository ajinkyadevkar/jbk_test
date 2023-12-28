package com.jbk.test;
//8.	Write a program to display below pattern			(5 marks)
//* * * * *
//* * * *
//* * *
//* * 
//*

public class Question8 {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++) {
			for(int j=i;j<=4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
