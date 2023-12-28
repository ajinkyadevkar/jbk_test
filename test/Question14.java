package com.jbk.test;

import java.util.ArrayList;
import java.util.List;

public class Question14 {

	   public static void main(String[] args) {
	        List<String> colorsList = new ArrayList<>();
	        colorsList.add("Red");
	        colorsList.add("Green");
	        colorsList.add("Blue");
	        colorsList.add("Yellow");
	        colorsList.add("Orange");

	        for (String color : colorsList) {
	            System.out.println(color);
	        }
	        colorsList.forEach(color -> System.out.println(color));
	    }
	}

