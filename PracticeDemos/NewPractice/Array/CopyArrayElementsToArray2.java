package com.PracticeDemos.NewPractice.Array;

import java.util.Scanner;

public class CopyArrayElementsToArray2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length of array :");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enetr Array Element : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int[] arr1=new int[arr.length];
		
		
		System.out.println("Original array");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			arr1[i]=arr[i];
		}
		
		System.out.println("\ncopy array");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
