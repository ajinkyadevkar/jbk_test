package com.jbk.test;
////9.	Write a program to display below pattern 			(5 marks)
//A  B  C  D
//   A  B  C
//      A  B
//         A

public class Question9 {

	public static void main(String[] args) {
		int a=4;
		for(int i=0;i<=a;i++) {
			for (int j=0;j<i;j++) {
					System.out.print(" ");
			}
			for(int k=0;k<a-i;k++) {
				char ch=(char)('A'+k);
				System.out.print(ch+"");
			
			}System.out.println();
			
		}
	}

}
