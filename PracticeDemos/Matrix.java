package com.PracticeDemos;

import java.util.Scanner;

public class Matrix {
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
		
		System.out.println("Boundary elements :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				
				if( j==0 || i==0 ||  j==arr[i].length-1 || i==arr.length-1) {
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
}
