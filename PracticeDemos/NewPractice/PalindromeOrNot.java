package com.PracticeDemos.NewPractice;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a numbers :");
		int num=sc.nextInt();
		int rem=0,sum=0,n=num;
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num/=10;
		}
		if(sum==n) {
			System.out.println("Number is palindrome");
		}
		else System.out.println("number is not palindrome");

	}

}
