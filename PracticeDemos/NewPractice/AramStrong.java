package com.PracticeDemos.NewPractice;

import java.util.Scanner;

public class AramStrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		int rem=0,sum=0,n=num;
		while(num>0) {
			rem=num%10;
			sum=sum+(int)Math.pow(rem, 3);
			num/=10;
		}
		if(n==sum) {
			System.out.println("arm strong");
		}
		else {
			System.out.println("not arm strong");
		}
	}

}
