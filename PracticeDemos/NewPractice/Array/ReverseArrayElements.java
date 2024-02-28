package com.PracticeDemos.NewPractice.Array;

import java.util.Scanner;

public class ReverseArrayElements {

	public static void main(String[] args) {
		//creating object of scanner class
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array length ");
		//creating array
		int[] arr=new int[sc.nextInt()];
		//reading user input
		System.out.println("Enter array elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		//displying array elements
		System.out.println("Array elements :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//reverse array elements using j variable
		//invoking method
		usingVariable(arr);
		System.out.println();
		//closing scanner object
		sc.close();
		
	}
	static void usingVariable(int[] arr) {
		System.out.println("Reverse array elements :");
		//creting j variable for traversing reverse
		int j=arr.length-1;
		int[] rev=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			//assigning the arr values to the rev array in reverse order
			rev[j]=arr[i];
			j--;
		}
		//diplying reverse array elements
		for (int i = 0; i < rev.length; i++) {
			System.err.print(rev[i]+" ");
		}
	}

}

















