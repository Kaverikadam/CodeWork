package com.array.programs;

import java.util.Scanner;

public class ArrayElementsDivisibleBy3 {
	public static void main(String[] args) {
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
		//displying orignal array
		System.out.println("Orignal array ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		//main code of array divisibe by 3
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%3==0) {
				arr[i]=0;
			}
			
		}
		//Displying array  elemnts
		System.out.println("Array elments which are divisiblee by 3");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	}
}
