package com.array.programs;

import java.util.Scanner;

public class TwoDEmployeeName {

	public static void main(String[] args) {
		//Reading user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many compnys you want :");
		int row=sc.nextInt();
		System.out.println("Enter how many Employees you want  :");
		int col=sc.nextInt();
		//Stroring array values
	
		String [][] ename=new String[row][col];
;		System.out.println("Enter Employee names :");
		for(int i=0;i<=row-1;i++) {
			for(int j=0;j<=col-1;j++) {
				System.out.println( "Name of comapany  "+(i+1)+" Employee is ");
					ename[i][j]=sc.next();
			}
		}
		//Displaying array values
		System.out.println("Names of Employees");
		for(int i=0;i<=row-1;i++) {
			for(int j=0;j<=col-1;j++) {
					System.out.println( "Name of comapany  "+(i+1)+" Employee "+j+1+" is "+ename[i][j]);								
			}
		}
	}
}
