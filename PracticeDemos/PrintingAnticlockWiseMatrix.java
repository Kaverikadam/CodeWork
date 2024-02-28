package com.PracticeDemos;

import java.util.Arrays;
import java.util.Scanner;

public class PrintingAnticlockWiseMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the elength of matrix :");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		
		System.out.println("Enter array elements :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
	
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i][0]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[arr.length-1][i]+" ");
		}

	}

}
