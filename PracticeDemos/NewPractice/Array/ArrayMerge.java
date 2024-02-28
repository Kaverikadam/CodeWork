package com.PracticeDemos.NewPractice.Array;

import java.util.Scanner;

public class ArrayMerge {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length of array 1");
		int[] arr1=new int[sc.nextInt()];
		
		
		System.out.println("Enter array 1 elemenets :");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter length of array 2");
		int[] arr2=new int[sc.nextInt()];
		
		System.out.println("Enter array 2 elemenets :");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		
		int[] arr3=new int[arr1.length + arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i]=arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr1.length+i]=arr2[i];
		}
		
		
		System.out.println("Mearged array elements are");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		sc.close();
	}

}















