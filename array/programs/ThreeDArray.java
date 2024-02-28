package com.array.programs;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of states");
		int state=sc.nextInt();
		System.out.println("Enetr no of citys in state:");
		int city=sc.nextInt();
		System.out.println("Enetr no of persons in city");
		int per=sc.nextInt();
		int [][][]age=new int[state][city][per];
		for(int i=0;i<=age.length-1;i++) {
			for(int j=0;j<=age[i].length-1;j++) {
				for(int k=0;k<=age[i][j].length-1;k++) {
					System.out.println("Enetr Persons "+(k+1)+" age who is from state"+(i+1)+" city "+(j+1)+" ");
					age[i][j][k]=sc.nextInt();
				}
			}
		}
		for(int i=0;i<=age.length-1;i++) {
			for(int j=0;j<=age[i].length-1;j++) {
				for(int k=0;k<=age[i][j].length-1;k++) {
					System.out.println(" State "+(i+1)+" city "+(j+1)+" Persons "+(k+1)+"Age is "+age[i][j][k]);
					
				}
			}
		}
		

	}

}
