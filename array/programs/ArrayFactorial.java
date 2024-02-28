
package com.array.programs;

import java.util.Scanner;

public class ArrayFactorial {

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
		
		for(int i=0;i<=arr.length-1;i++) {
			//storing the array elements in array
			int factorial=isFactorial(arr[i]);
			System.out.println("Factorial of "+arr[i]+" : "+ factorial);
		}
		
		
	}
	static int isFactorial(int factorial) {
		int fact=1;
		for(int i=1;i<=factorial;i++) {
			fact=factorial*i;
		}
		return fact;
		
		
	}
}
