package com.jbk.test;

//6.	Write a Java program to find the number of days in a month.
import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        int daysInMonth;
        switch (month) {
            case 1: 
                daysInMonth = 31;
                break;
            case 3: 
                daysInMonth = 31;
                break;
            case 5: 
                daysInMonth = 31;
                break;
            case 7: 
                daysInMonth = 31;
                break;
            case 8: 
                daysInMonth = 31;
                break;
            case 10: 
                daysInMonth = 31;
                break;
            case 12: 
                daysInMonth = 31;
                break;
            case 4: 
                daysInMonth = 30;
                break;
            case 6: 
                daysInMonth = 30;
                break;
            case 9: 
                daysInMonth = 30;
                break;
            case 11: 
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = 28;
                break;
            default:
                System.out.println("Invalid month.");
                return;
        }
        System.out.println("Number of days in the month: " + daysInMonth);
    }
}
