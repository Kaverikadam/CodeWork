package com.array.programs;

import java.util.Scanner;

public class RegularArrayWhichStroreAgeOfPerson {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row numbers");
		int row=sc.nextInt();		
		int[][]age=new int[row][];
		System.out.println("Enter number of column in row ");
		int pAge=sc.nextInt();
		for(int i=0;i<=age.length-1;i++) {
			age[i]=new int[pAge];
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
