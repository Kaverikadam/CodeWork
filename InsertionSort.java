package com.Algorithms;

import java.util.Scanner;

public class InsertionSort {

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
		
		for(int i=1;i<arr.length;i++) {
			int elem=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>elem) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=elem;
			
			
		}
		System.out.println();
		System.out.println("Array sorted using insertion :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
