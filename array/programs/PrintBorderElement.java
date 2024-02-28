package com.array.programs;
import java.util.Scanner;
public class PrintBorderElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		 System.out.println("Enter array length :");
		 int r=sc.nextInt();
		 int c=sc.nextInt();
		 int[][] arr=new int[r][c];
		 
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
		 System.out.println();
		 //printing array border elements :
		 //printing first row
		 for(int i=0;i<c-1;i++) {
			 System.out.print(arr[0][i]+" ");
		 }
		 //printing last col except first row
		 for(int i=0;i<r;i++) {
			 System.out.print(arr[i][c-1]+" ");
		 }
		 
		 //printing last row except first col
		 if(r>1) {
			 for(int i=c-2;i>=0;i--) {
				 System.out.print(arr[r-1][i]+" ");
			 }
		 }
		 
		 //printing first col except first and last row
		 
		 if(c>1) {
			 for(int i=r-2;i>0;i--) {
				 System.out.print(arr[i][0]+" ");
			 }
		 } 
		 
	}

}
