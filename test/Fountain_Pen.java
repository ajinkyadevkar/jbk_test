package com.jbk.test;

public class Fountain_Pen extends Pen{

	@Override
	void write() {
		System.out.println("Fountain Pen is smooth for writing....... ");
	}

	@Override
	void refill() {
		System.out.println("We can Refill it..........");
		
	}
	void change_Nib() {
		System.out.println("To change the nib we can replace it......");
	}

}
