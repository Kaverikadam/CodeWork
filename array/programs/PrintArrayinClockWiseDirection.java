package com.array.programs;

import java.util.Scanner;

public class PrintArrayinClockWiseDirection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][3];
		
		System.out.println("Enetr array elements :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {				
				arr[i][j]=sc.nextInt();	
			}
		}	
		
		System.out.println("Array elements :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int n=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(i<n) {
				System.out.print(arr[0][i]+" ");
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==n || j==n) {
					System.out.print(arr[i][j]+" ");
				}
			}
			
		}
	}
}
