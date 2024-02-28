package com.PracticeDemos;

import java.util.Scanner;

public class CheckPalindromeNumberOrNot {

	public static void main(String[] args) {
		// Check Number is prime or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a number");
		int n=sc.nextInt();
		int rem=0,sum=0,num=n;
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum=sum*10+rem;			
		}
		if(num==sum) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}

	}

}
