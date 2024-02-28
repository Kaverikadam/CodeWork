package com.PracticeDemos.NewPractice.Array;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr length of array :");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enetr array elements ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Duplicate array elements :");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println(arr[i]+" ");
				}
			}
		}

	}

}
