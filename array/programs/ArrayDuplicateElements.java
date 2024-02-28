package com.array.programs;

import java.util.Scanner;

public class ArrayDuplicateElements {

	public static void main(String[] args) {
		//Creating object of scanner class
		Scanner sc=new Scanner(System.in);
		//asking user to enter array length
		System.out.println("Enter array length :");
		int[] arr=new int [sc.nextInt()];
		
		//Reding the array elements using for loop
		System.out.println("Enter array elements :");
		for(int i=0;i<=arr.length-1;i++) {
			//storing the array elements in array
			arr[i]=sc.nextInt();
		}
	
		//finding duplicate elements
		System.out.println("Duplicate array duplicate :");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				//checking whether the array elemnets are same or not
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}
