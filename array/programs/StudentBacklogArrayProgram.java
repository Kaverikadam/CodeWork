package com.array.programs;

import java.util.Scanner;

public class StudentBacklogArrayProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you have any active backlogs..!!");
		String backlog =sc.next();
		boolean back=false ;
		int sum=0,sem=8;
		int []backnum=new int[9];
		if(backlog.equals("yes")) {
			back=true;
		}
		else {
			back=false;
		}
		if(back==true) {
			for(int i=1;i<=8;i++) {
				System.out.println("Enter "+(i)+" sem backlog no :");
				backnum[i]=sc.nextInt();
			}
		}
		//Displying the backlogs
		for(int i=1;i<=8;i++) {
			System.out.println("Status of backlogs sem "+i+" and no of backlogs "+backnum[i]);
			sum=sum+backnum[i];
		}
		System.out.println("Current active backlogs :"+sum);
	}

}
