package com.Algorithms;

import java.util.Scanner;

public class SwappingArrayElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array :");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enetr array elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
				
		System.out.println("\nEnetr indexes on which position you want to swap :");
		int[] index=new int[arr.length];
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			index[i]=sc.nextInt();
		}
		int s=arr.length-1;
		if(s<=arr.length) {
			System.out.println("Before swapping array elemenys :");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
			for(int i=0;i<arr.length;i++) {
				int n=index[i];
				arr1[i]=arr[n];
			}
			System.out.println("\nAfter swapping array elements ");
			for(int i=0;i<arr.length;i++) {
				System.err.print(arr1[i]+" ");
			}
		}
		else {
			System.out.println("Enterd arra element is invalid ");
		}
		
		

	}

}
