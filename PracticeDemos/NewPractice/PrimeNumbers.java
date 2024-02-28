package com.PracticeDemos.NewPractice;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		isPrime(num);
		isPrimeNo(num);
	}
	static void isPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(num+" is a prime");
		}
		else
			System.out.println(num+" is not prime");
	}
	
	
	static void isPrimeNo(int num) {
		int count=0;
		System.out.println("\n\nPrime numbers :");
		for(int i=1;i<=num;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			
			if(count==2) {
				System.out.print(i+" ");
			}
		}
	}
}
