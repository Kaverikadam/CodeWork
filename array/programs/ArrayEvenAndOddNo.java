package com.array.programs;

import java.util.Scanner;

public class ArrayEvenAndOddNo {

	public static void main(String[] args) {
		//Creating object of Scanner class
				Scanner sc=new Scanner(System.in);
				//Asking user to enter the length of array and reading the user value in array 
				System.out.println("Enter number of students :");
				int[] arr=new int[sc.nextInt()];
				//Reding the ages of students  using for loop
				System.out.println("Enter array elements :");
				for(int i=0;i<=arr.length-1;i++) {
					//storing the array elements in array
					arr[i]=sc.nextInt();
				}
				//creating variables
				int n=0,n1=0;
				//main code to check array elemnts are even or not 
				for(int i=0;i<=arr.length-1;i++) {
					if(arr[i]%2==0) {
						n++;
					}
					else {
						n1++;
					}
				}
				
				System.out.println("Array even numbers are "+n);
				System.out.println("Array even numbers are "+n1);
	}

}
