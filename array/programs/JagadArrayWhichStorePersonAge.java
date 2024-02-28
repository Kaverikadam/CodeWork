package com.array.programs;

import java.util.Scanner;

public class JagadArrayWhichStorePersonAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row numbers");
		int row=sc.nextInt();		
		int[][]age=new int[row][];
		
		for(int i=0;i<=age.length-1;i++) {
			System.out.println("Enter number of column in row "+(i+1));
			age[i]=new int[sc.nextInt()];
		}
		System.out.println("Enter array elements :");
		for(int i=0;i<=age.length-1;i++) {
			for(int j=0;j<=age[i].length-1;j++) {
				age[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enterd array elements are :");
		for(int i=0;i<=age.length-1;i++) {
			for(int j=0;j<=age[i].length-1;j++) {
				System.out.print(age[i][j]+" ");
			}
			System.out.println();
		}
	}

}
