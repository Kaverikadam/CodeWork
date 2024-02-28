package com.array.programs;

import java.util.Scanner;

public class ReversingArrayElements {

	public static void main(String[] args) {
		//creating Scanner class object
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of students :");
		//Reading user input  length of array
		int[] arr=new int[sc.nextInt()];
		//reding user input array elements 
		System.out.println("Enter student ages:");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		//creating the array 2 
		int []arr2=new int[arr.length];
		//creating j variable
		int j=arr.length-1;
		
		//reversing the array values and storing in array 2
		for(int i=0;i<=arr.length-1;i++) {
			arr2[j]=arr[i];
			j--;
		}
		//printing the array elements
		System.out.println("Array 1 Elements :");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		//displying the array 2 values		
		System.out.println("Array 2 Elements :");
		for(int i=0;i<=arr2.length-1;i++) {
			System.out.println(arr2[i]);
		}

	}

}
