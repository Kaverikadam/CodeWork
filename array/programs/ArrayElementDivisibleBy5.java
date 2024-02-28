package com.array.programs;

import java.util.Scanner;

public class ArrayElementDivisibleBy5 {

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
		//creating variable n
		int n=0;
		//main code of array reverse
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%5==0) {
				n++;
			}
			
		}
		
		System.out.println("Array elments which are divisible by 5 "+n);
		

	}

}
