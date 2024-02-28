package com.array.programs;

import java.util.Scanner;

public class ArrayGCD {

	public static void main(String[] args) {
		//Creating object of scanner class
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int [5];
		
		//Reding the array elements using for loop
		System.out.println("Enter array elements :");
		for(int i=0;i<=arr.length-1;i++) {
			//storing the array elements in array
			arr[i]=sc.nextInt();
		}
		int gcd=0;
		for(int i=1;i<arr.length;i++) {
			//calculating gcd
			if(arr[0]%i==0 && arr[4]%i==0) {
				//assinging i value to the gcd 
				gcd=i;
			}
		}	
		System.out.println("GCD of "+arr[0]+" and "+arr[4]+" : "+gcd);
	}
}
