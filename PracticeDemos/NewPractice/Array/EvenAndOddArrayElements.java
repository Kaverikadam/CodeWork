package com.PracticeDemos.NewPractice.Array;

import java.util.Scanner;

public class EvenAndOddArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array length ");
		int[] arr = new int[sc.nextInt()];
		
		System.out.println("Enetr array elements ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Even Numbers :");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
			
		}
		System.out.println("Odd Numbers :");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==1) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
