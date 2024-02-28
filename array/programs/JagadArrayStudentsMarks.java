package com.array.programs;

import java.util.Scanner;

public class JagadArrayStudentsMarks {

	public static void main(String[] args) {
		// Reading user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr First class student numbers :"); 
		int first=sc.nextInt();
		System.out.println("Enetr First class student numbers :"); 
		int sec=sc.nextInt();
		System.out.println("Enetr First class student numbers :"); 
		int third=sc.nextInt();
		//Sepcifing no of rows in the array
		int[][] marks=new int[3][];
		//Sepcifing no of coloms in each row
		marks[0]=new int[first];
		marks[1]=new int[sec];
		marks[2]=new int[third];
		//reading user input and storing in array
		for(int i=0;i<=marks.length-1;i++) {
			for(int j=0;j<=marks[i].length-1;j++) {
				System.out.println("Enetr marks of class:"+(i+1)+" student "+(j+1)+" is ");
				marks[i][j]=sc.nextInt();
			}
		}
		//displaying the stored array
		for(int i=0;i<=marks.length-1;i++) {
			for(int j=0;j<=marks[i].length-1;j++) {
				System.out.println("The marks of Class "+(i+1)+" Student marks ="+marks[i][j]);
			}
		}
	}
}
