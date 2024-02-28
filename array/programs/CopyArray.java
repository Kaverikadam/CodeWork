package com.array.programs;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int[] arr1=new int[sc.nextInt()];
		int[] arr2=new int[arr1.length];
		
		System.out.println("Enetr the element of  an array");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=sc.nextInt();
		}
		int j=arr1.length-1;
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[j]=arr1[i];
			
		}
		System.out.println("Elements of array 1");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("Elements of array 2");
		for(int i=0;i<=arr1.length-1;i++) {
			System.out.println(arr2[i]);
		}
	}
}
