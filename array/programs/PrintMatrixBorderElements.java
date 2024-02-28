package com.array.programs;

import java.util.Scanner;

public class PrintMatrixBorderElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Square matrix ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a=0;
		int[][]arr=new int[r][c];
		
		System.out.println("Enetr matrix elements");
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println(arr[0][j]+" ");
			}
		}
	}

}
