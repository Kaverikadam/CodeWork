package com.PracticeDemos;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter array elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		//sorting with insertion sort
		for (int i = 1; i < arr.length; i++) {
			int j=i-1;
			int ele=arr[i];
			while(j>=0 && arr[j]>ele) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=ele;
		}
		System.out.println("Sorted array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
