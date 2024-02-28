package com.array.programs;

import java.util.Scanner;

public class OneDArrayStudentMarks {

	public static void main(String[] args) {
		//creating object of Scanner class
		Scanner sc=new Scanner(System.in);
		//reading number of students which is number of rows in array
		System.out.println("Enter the number of students :");
		float[] marks=new float[sc.nextInt()];
		//Reading marks of elements which is data elements of array
		for(int i=0;i<=marks.length-1;i++) {
			System.out.println("Enetr Marks of student :"+(i=1));
			marks[i]=sc.nextFloat();
		}
		//Displying the student marks
		for(int i=0;i<=marks.length-1;i++) {
			System.out.println("Percentage of student "+(i+1)+" :"+marks[i]);
		}

	}

}
