package com.PracticeDemos;

import java.util.Scanner;

public class BinarySearchP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length :");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enetr array  elements :");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter key value to be searched : ");
		int key=sc.nextInt();
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(key==arr[mid]) {
				System.out.println("Key found at index "+mid);
				return;
			}
			else if(key> arr[mid]) {
				low=mid+1;
			}
			else if(key< arr[mid]) {
				high=mid-1;
			}
		}
		System.out.println("Key not found..");

	}

}
