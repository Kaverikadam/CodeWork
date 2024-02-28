package com.PracticeDemos;

import java.util.Scanner;

public class armStrong {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n=sc.nextInt();
		int rem=0,num=0,n1=n;
		while(n>0) {
			rem=n%10;
			num=num+(int)Math.pow(rem, 3);
			n=n/10;		
		}
		if(num==n1) 
		{
			System.out.println(num+" Number is Aramstrong");
		}
		else 
		{
			System.out.println(num+" Number is not Armstrong");
		}
			
	}

}
