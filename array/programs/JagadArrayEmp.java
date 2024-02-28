package com.array.programs;

import java.util.Scanner;

public class JagadArrayEmp {
	public static void main(String[] args) {
		// Reading user input
		Scanner sc=new Scanner(System.in);
		
		//Sepcifing no of rows in the array
		String[][] emp=new String[4][];
		//Sepcifing no of coloms in each row
		emp[0]=new String[2];
		emp[1]=new String[4];
		emp[2]=new String[1];
		emp[3]=new String[3];
		//reading user input and storing in array
		for(int i=0;i<=emp.length-1;i++) {
			for(int j=0;j<=emp[i].length-1;j++) {
				System.out.println("Enetr Company:"+(i+1)+" Employee  "+(j+1)+" is ");
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
