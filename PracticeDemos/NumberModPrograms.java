package com.PracticeDemos;

import java.util.Scanner;

public class NumberModPrograms {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1;
		while(i==1) {
			System.out.println("Choose what you want !\n"
					+ "1) Reverse a number\n"
					+ "2) Sum of digit\n"
					+ "3) Sum of natural numbers\n"
					+ "4) PAlindrome");
			
			int choice=sc.nextInt();
			System.out.println("Enetr a number :");
			int number=sc.nextInt();
			switch(choice) {
			case 1:reverseNumber(number);
			break;
			case 2:sumOfDigit(number);
			break;
			case 3:sumOfNaturalNo(number);
			break;
			case 4:palindrome(number);
			break;
			}
			System.out.println("\nDo you want to contine press 1 else press other number :");
			i=sc.nextInt();
			
		}
	}
	
	static void reverseNumber(int number) {
		int rem=0,rev=0;
		while(number >0) {
			rem=number%10;
			number=number/10;
			rev=rev*10+rem;			
		}		
		System.out.println("Reverse of a number is : "+rev);
	}
	
	static void sumOfDigit(int number) {
		int rem=0,rev=0,sum=0;
		while(number >0) {
			rem=number%10;
			number=number/10;
			rev=rev*10+rem;
			sum=sum+rem;
		}
		System.out.println("Sum of ennterd number digit is : "+sum);
	}
	
	static void sumOfNaturalNo(int number) {
		int rem=0,sum=0;int n=number;
		while(number>0) {
			rem=number%10;
			number=number/10;
			sum=sum+rem;
		}
		System.out.println("Sum of natural numbar is "+sum);
	}
	static void palindrome(int number) {
		int rem=0,sum=0;int n=number;
		while(number>0) {
			rem=number%10;
			number=number/10;
			sum=sum*10+rem;
		}
		if(sum==n) {
			System.out.println(n+" is Palindrome");
		}
		else {
			System.out.println(n+" is not a palindrome");
		}
	}
}
