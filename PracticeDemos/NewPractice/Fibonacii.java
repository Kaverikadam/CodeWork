package com.PracticeDemos.NewPractice;

import java.util.Scanner;

public class Fibonacii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr a number ");
		int num=sc.nextInt();
		
		isFibo(num);
		System.out.println("\nFibonacii of "+ num+ " is ");
		for(int i=1;i<=num;i++) {
			System.out.print(recFibo(i)+" ");
		}
	}
	static void isFibo(int num) {
		int n1=0,n2=1,fib=0;
		System.out.print(n1+" "+n2+" ");
		for(int i=3;i<=num;i++)
		{
			fib=n1+n2;
			System.out.print(+fib+" ");
			n1=n2;
			n2=fib;	
		}
	}
	
	static int recFibo(int num) {
		if(num==1 || num==2) {
			return 1;
		}
		return recFibo(num-1) + recFibo(num-2);
	}

}
