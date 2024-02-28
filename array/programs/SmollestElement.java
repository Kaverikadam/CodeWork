package com.array.programs;

import java.util.Scanner;

public class SmollestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr array length");
		int[]arr=new int[sc.nextInt()];
		
		System.out.println("Enter array elements :");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		int least=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				least=arr[i+1];
			}
		}
		System.out.println("Smollest element of array "+least);
	}

}
