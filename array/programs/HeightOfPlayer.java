package com.array.programs;

import java.util.Scanner;

public class HeightOfPlayer {
	// Height of players printing and storing in array

	public static void main(String[] args) {
		//creating scanner class object
		Scanner sc=new Scanner(System.in);
		//Reading user input 
		System.out.println("Enter a Length of array :");
		int length=sc.nextInt();
		
		System.out.println("Enter a height of players :");
		float height[]=new float[length] ;
		//for loop is using to take the user input 
		for(int i=0;i<=length-1;i++) {
			height[i]=sc.nextFloat();
			} 
		//printing the height of players
		System.out.println("Height of players:");
		for(int i=0;i<=length-1;i++) {
			System.out.println(height[i]);
		}
	}

}
