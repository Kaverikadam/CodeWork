package com.array.programs;

import java.util.Scanner;

public class TwoDArrayStudentMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr number of classes :");
		float [][]marks=new float[sc.nextInt()][];
		
		
		for(int i=0;i<=marks.length-1;i++) {
			System.out.println("Enetr number of students in class"+(i+1));
			marks[i]=new float[sc.nextInt()];
		}
		for(int i=0;i<=marks.length-1;i++) {
			for(int j=0;j<=marks[i].length-1;j++) {
				System.out.println("Enetr marks of class "+(i+1)+" student "+(j+1));
				marks[i][j]=sc.nextFloat();
			}
					}
		for(int i=0;i<=marks.length-1;i++) {
			for(int j=0;j<=marks[i].length-1;j++) {
				System.out.println("marks of class "+(i+1)+" student "+(j+1)+" is "+marks[i][j]);
			}
			System.out.println();
		}

	}

}
