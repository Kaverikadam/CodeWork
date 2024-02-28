package com.Algorithms;

import java.util.Scanner;

public class SortAndSearchArrayEle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array length :");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("enter a array elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter key to be find :");
		int key=sc.nextInt();
		
		
		if(checkArraySorted(arr)) {
			binarySearch(arr,key);
		}
		else {
			int[] sortArray=bubbleSort(arr);
			binarySearch(sortArray, key);
		}
	}
	
	
	static boolean checkArraySorted(int[] arr) {
		
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}	
		}
		return true;
	}
	
	
	static void binarySearch(int[] arr,int key) {
		int low=0,high=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				System.out.println(key+" Key is found in array");
				return;
			}
			else if(key>arr[mid]) {
				low=mid+1;
			}
			else if(key<arr[mid]) {
				high=mid-1;
			}
		}
		System.out.println(key+" key not found in array");
		
		
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

}
