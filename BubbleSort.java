package com.Algorithms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr array length :");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter array elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length-2;i++) {
			for(int j=0;j<arr.length-2-i;j++) {
				if(arr[i]>arr[i+1]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		System.out.println("Sorted array is :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
