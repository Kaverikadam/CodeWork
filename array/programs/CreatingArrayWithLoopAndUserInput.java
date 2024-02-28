package com.array.programs;

import java.util.Scanner;

public class CreatingArrayWithLoopAndUserInput {
	public static void main(String[] args) {
		// Creating object of a scanner class to read user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of comapny :");
		//Creating array with loop and user input to reduce the code redundancy
		String[][]emp=new String[sc.nextInt()][];
		
		for(int i =0;i<=emp.length-1;i++) {
			System.out.println("Enter no of Employees in comapy"+(i+1)+" ");
			//Using loop to create number of columns in array with user input
			emp[i]=new String[sc.nextInt()];
		}
		
		//reading user input and storing in array
		for(int i=0;i<=emp.length-1;i++) {
			for(int j=0;j<=emp[i].length-1;j++) {
				System.out.println("Enetr Company:"+(i+1)+" Employee  "+(j+1)+" name  is ");
				emp[i][j]=sc.next();
			}
		}
		//displaying the stored array
		for(int i=0;i<=emp.length-1;i++) {
			for(int j=0;j<=emp[i].length-1;j++) {
				System.out.println("The Company "+(i+1)+" Employee ="+emp[i][j]);
			}
		}
	}
}
