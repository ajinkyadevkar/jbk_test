package com.jbk.test;
//10.	 Write a Java program to find common elements between two arrays (string values).
public class Question10 {

	public static void main(String[] args) {
		String arr1[]= {"Rohit","Virat","Shikhar","Shreyas","Shubman"};
		String arr2[]= {"Ruturaj","Yashasvi","Shubman","Virat"};
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]+" is common in both array");
				}
			}
		}
	}

}
