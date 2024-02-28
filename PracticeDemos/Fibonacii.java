package com.PracticeDemos;

import java.util.Scanner;

public class Fibonacii {

	public static void main(String[] args) {
		// Fibonacci Series 
		Scanner sc=new Scanner(System.in);
		
		int n=1;
		while(n==1) {
			System.out.println("Enetr a number to calculate fibonacii series :");
			int num=sc.nextInt();
			
			System.out.println("Choose what you want \n1) Fibonacci series \n2) Fibonacii number");
			int number=sc.nextInt();
			
			switch(number) {
			case 1:fibonacciSeries(num);
			break;
			case 2: fibonacciNo(num);
			}
			System.out.println("\nYou wannt more press 1 else press other number");
			n=sc.nextInt();
			if(n!=1) {
				System.out.println("Thank you...");
			}
		}

	}
	static void fibonacciSeries(int num) {
		int n1=0,n2=1,fib=0;		
		if(num<=0) {
			System.out.println("Invalid number");
		}
		else {
			System.out.print(n1+", "
					+ ""+n2+", ");
			for(int i=2;i<=num;i++) {
				fib=n1+n2;
				System.out.print(fib+" ,");
				n1=n2;
				n2=fib;
			}
		}
	}
	static void fibonacciNo(int num) {
int n1=0,n2=1,fib=0;
		
		if(num<=0) {
			System.out.println("Invalid number");
		}
		else if(num==0) {
			System.out.println("Fibonacci Number of "+num+" = "+n1);
		}
		else if(num==1) {
			System.out.println("Fibonacci Number of "+num+" = "+n2);
		}
		else {
			
			for(int i=2;i<=num;i++) {
				fib=n1+n2;
				n1=n2;
				n2=fib;
			}
			System.out.print("Fibonacci Number of "+num+" = "+fib);
		}
	}
	

}
