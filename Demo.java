package com.Algorithms;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr array length :");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter array elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enetr key value to be searched :");
		int key =sc.nextInt();
		
		
		
		
		
		
		
		
	}
	
	static int[] bubbleSort(int[] arr) {
		
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
		
		return arr;
	}
	
	static void binarySearch(int[] arr,int key) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(key==arr[mid]) {
				
			}
		}
		
	}

}
