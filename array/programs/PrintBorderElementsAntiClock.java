package com.array.programs;

import java.util.Scanner;

public class PrintBorderElementsAntiClock {

	public static void main(String[] args) {
		// creating object for Scanner class
		 Scanner sc=new Scanner (System.in);
		 System.out.println("Enter array length :");
		 //reading length of matrix rows and columns
		 int r=sc.nextInt();
		 int c=sc.nextInt();
		 
		 // creating array name arr
		 int[][] arr=new int[r][c];
		 
		 //Reading array elements
		 System.out.println("Enter array elements :");
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr.length;j++) {
				 arr[i][j]=sc.nextInt();
			 }
		 }
		 //Printing array elements
		 System.out.println("Array elements :");
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr.length;j++) {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
		 //Printing first colums  all elements
		 System.out.println();
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i][0]+" ");
		 }
		 
		 //printing last row except first col
		 for(int i=1;i<arr.length;i++) {
			 System.out.print(arr[arr.length-1][i]+" ");
		 }
		//printing last col except last row and first row
		 for(int i=arr.length-2;i>0;--i) {
			 System.out.print(arr[i][arr.length-1]+" ");
		 }
		 
		 //printing first row except first col
		 for(int i=arr.length-1;i>0;--i) {
			 System.out.print(arr[0][i]+" ");
		 }
		 
		 
	}

}
