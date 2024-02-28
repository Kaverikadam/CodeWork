package com.Algorithms;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the length of array ");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enetr elements of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Original array :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int min=arr[i];
				int pos=i;
				if(arr[j]>min) {
					min=arr[j];
					pos=j;
				}
				int temp=arr[pos];
				arr[pos]=arr[j];
				arr[j]=temp;
			}
		}
		
		
		System.out.println("\nSorted array using selection sort :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

