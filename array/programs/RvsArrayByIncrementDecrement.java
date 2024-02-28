package com.array.programs;

import java.util.Scanner;

public class RvsArrayByIncrementDecrement {
	public static void main(String[] args) {
		//Creating object of Scanner class
		Scanner sc=new Scanner(System.in);
		//Asking user to enter the length of array and reading the user value in array 
		System.out.println("Enter number of students :");
		int[] arr=new int[sc.nextInt()];
		//Reding the ages of students  using for loop
		System.out.println("Enter student ages:");
		for(int i=0;i<=arr.length-1;i++) {
			//storing the array elements in array
			arr[i]=sc.nextInt();
		}
		//creating secod array to store reverse form of array 1
		int []arr2=new int[arr.length];
		//creating j variable it helps  to store array elemnts in reverse order-j value is [array length -1 ]
		int j=arr.length-1;
		
		//main code of array reverse
		for(int i=0;i<=arr.length-1;i++) {
			arr2[j]=arr[i];
			j--;
		}
		//Displying array 1 elemnts
		System.out.println("Array 1 Elements :");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]+=3;
			System.out.println(arr[i]);
		}
		//displying array 2 elements
		System.out.println("Array 2 Elements :");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]-=5;
			System.out.println(arr2[i]);
		}

	}
}
