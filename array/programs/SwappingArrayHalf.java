package com.array.programs;

import java.util.Scanner;

public class SwappingArrayHalf {

	/*  int this swapping method where array first elements are 
	 * swapped in last array position and last position array elements 
	 * are swpped in fist position middle elemenet is stay constant*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a length of array");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enetr elements of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println("Original array :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		int Length=arr.length/2;
		int j=arr.length-1;
		for (int i = 0; i < Length; i++) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
			
		}
		System.out.println("Swapped array :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
