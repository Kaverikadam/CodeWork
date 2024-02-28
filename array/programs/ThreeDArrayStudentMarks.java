package com.array.programs;

import java.util.Scanner;

public class ThreeDArrayStudentMarks {

	public static void main(String[] args) {
		//creating Scanner class object
		Scanner sc=new Scanner(System.in);
		
		//Reading user input number of blocks (number of schools)
		System.out.println("Enetr no of school");
		
		float [][][]marks=new float[sc.nextInt()][][];
		//reading user input number of rows(number of classes) by using single for loop
		for(int i=0;i<=marks.length-1;i++) {
			System.out.println("Enetr school "+(i+1)+" number of classes ");
			marks[i]=new float[sc.nextInt()][];
		}
		//reading number of columns (number of studets) by using nested loop
		for(int i=0;i<=marks.length-1;i++) {
			for(int j=0;j<=marks[i].length-1;j++) {
				System.out.println("Enetr school "+(i+1)+" class "+(j+1)+" number of students ");
				marks[i][j]=new float[sc.nextInt()];
			}
		}
		
		//reding user input which is array elements(Percentage of students) and storing in array marks
		for(int i=0;i<=marks.length-1;i++) {
			for(int j=0;j<=marks[i].length-1;j++) {
				for(int k=0;k<=marks[i][j].length-1;k++) {
					System.out.println("Enetr school "+(i+1)+" class "+(j+1)+" student "+(k+1)+" marks ");
					marks[i][j][k]=sc.nextFloat();
				}
			}
		}
		
		//displyiing array elements(students percentages) 
		for(int i=0;i<=marks.length-1;i++) {
			for(int j=0;j<=marks[i].length-1;j++) {
				for(int k=0;k<=marks[i][j].length-1;k++) {
					System.out.println("Enetr school "+(i+1)+" class "+(j+1)+" student "+(k+1)+" marks is "+marks[i][j][k]);
					
				}
				System.out.println();
			}
		}

	}

}
