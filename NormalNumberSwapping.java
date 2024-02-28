package com.Algorithms;

import java.util.Scanner;

public class NormalNumberSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr number 1:");
		int num1=sc.nextInt();
		System.out.println("Enetr number 2:");
		int num2=sc.nextInt();
		System.out.println("before swapping numbers :"+num1+" "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		/* int temp;
		 * temp=num1;
		 * num1=num2;
		 * num2=temp; 
		 */
		System.out.println("after swapping numbers :"+num1+" "+num2);

		
		
		
	}

}
