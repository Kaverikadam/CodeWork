package com.array.programs;

import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr array length");
	int[]arr=new int[sc.nextInt()];
	
	System.out.println("Enter array elements :");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
	}
	int largest=arr[1];
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				largest=arr[i];
			}
			
		}
	}
	System.out.println("Largest element of array "+largest);
	}
}
