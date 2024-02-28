package com.PracticeDemos.NewPractice.Array;

import java.util.Scanner;

public class PrimeElementOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array length :");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enetr array elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		isPrime(arr);
		for (int i = 0; i < arr.length; i++) {
			
		}
	}
	static void isPrime(int[] arr) {
		System.out.println("Prime elements are :");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 2; j < arr.length; j++) {
				
			}
		}
	}

}
