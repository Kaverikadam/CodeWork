package com.PracticeDemos;

import java.util.Scanner;

public class FactorialNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int I=1;
		while(I==1) {
			
			System.out.println("Enter a number which you want to be calculate factorial :");
			int num=sc.nextInt();
			
			System.out.println("What you want \n 1) Factorial Series "
					+ "\n 2)Factorial of n "
					+ "\n enetr your choice 1 or 2");
			int n=sc.nextInt();
			
			
			switch(n) {
			case 1:factorialNumber(num);
				break;
				
			case 2: factorialNthTerm(num);
				break;
			}
			System.out.println("\nYou want more press 1 else press other number :");
			I=sc.nextInt();
			if(I!=0) {
				System.out.println("Thank you..");
			}
		}
		
		

	}
	static void factorialNthTerm(int num) {
		int fact=1;
		if(num<=0) {
			System.out.println("Invalid number");
		}
		else {
			for(int i=num;i>=1;--i) {//for(inti=1;i<=num;i++)
				fact=fact*i;
			}
			System.out.println("Factorial of "+num+" = "+fact);
		}
	}
	
	
	
	static void factorialNumber(int num) {
		int fact=1;
		System.out.println();
		if(num<=0){
			System.out.println("Invalid number ");
		}
		else if(num==1) {
			System.out.println(fact);
		}
		else {
			for(int i=1;i<=num;i++) {
				fact=fact*i;
				System.out.print(fact+", ");
				
				
			}
		}
	}

}

