package com.PracticeDemos.NewPractice;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		
		System.out.println("Factorial of "+num+" is "+isFacto(num));
		isFactoNormal(num);
		
	}
	
	
	
	static int isFacto(int num) {
		if(num<=1) {
			return 1;
		}
		return num*isFacto(num-1);
	}
	
	static void isFactoNormal(int num) {
		int fact=1;
		if(num<=1) {
			System.out.println("Factorial of "+num+" is "+num);
		}
		else {
			for(int i=1;i<=num;i++) {
				fact *=i;
			}
			System.out.println("Factorial of "+num+" is "+fact);
		}
	}
}
