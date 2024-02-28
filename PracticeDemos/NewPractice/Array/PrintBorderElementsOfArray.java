package com.PracticeDemos.NewPractice.Array;

import java.util.Scanner;

public class PrintBorderElementsOfArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr array length ");
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		
		System.out.println("Enter array elements :");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		clockwiseArray(arr);
		
		

	}
	static void clockwiseArray(int[][] arr) {
		System.out.println("Array border elements :");
		
		//print First row
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[0][i]+" ");
		}
		
		//print last col except first row
		
		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i][arr.length-1]+" ");
		}
		
		//print last row except except last col
		for(int i=arr.length-2;i>=0;i--) {
			System.out.print(arr[arr.length-1][i]+" ");
		}
		//print first col except first and last row
		for(int i=arr.length-2;i>0;i--) {
			System.out.print(arr[i][0]+" ");
		}
	}

}




























