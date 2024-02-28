package com.PracticeDemos.NewPractice.Array;

import java.util.Scanner;

public class LargestAndSomllestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a length of array :");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enetr array elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int min=0,max=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					min=arr[i];
				}
				if(arr[i]<arr[j]) {
					max=arr[i];
				}
			}
		}
		
		System.out.println("Array max element is "+max+" Min element is "+min);
	}

}
