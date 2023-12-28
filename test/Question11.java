package com.jbk.test;
//Write a Java program to find the second largest element and second smallest element in an array.	
public class Question11 {

	public static void main(String[] args) {
		
		int arr[]= {45,78,15,25,65,35,95,20};
		int num=arr[0];
		for(int i=1;i<arr.length;i++) {
			
			if(num<arr[i]) {
				System.out.println("Second greatest number is "+arr[i+1]);
			}
		}

	}

}
