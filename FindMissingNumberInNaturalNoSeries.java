package com.Algorithms;

import java.util.Scanner;

public class FindMissingNumberInNaturalNoSeries {

	public static void main(String[] args) {
		// creating object of Scanner class as sc
		Scanner sc=new Scanner(System.in);
		//readoing user input length of array
		System.out.println("Enetr length of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		//reading user input as array elements
		System.out.println("Enter array elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	
		int total=n*(n+1)/2;
		int index,arrSum=0;
		
		//not supportng for each loop
		for(int i=0;i<arr.length;i++) {
			arrSum+=arr[i];
		}
		index=arrSum-total;
		System.out.println("Missing number is "+index);
	}
}
