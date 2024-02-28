package com.Algorithms;

import java.util.Scanner;

public class LastOccurenceOfKey {

	public static void main(String[] args) {
		// creating object of Scanner class as sc
		Scanner sc=new Scanner(System.in);
		//readoing user input length of array
		System.out.println("Enetr length of array");
		int[] arr=new int[sc.nextInt()];
		
		//reading user input as array elements
		System.out.println("Enter array elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//reading key value as the users input
		System.out.println("Enetr a key value :");
		int key=sc.nextInt();
		
		int k=0;
		
		//creating aloop to find a key
		for(int i=0;i<arr.length;i++) {
			//key == arr[i] assingning arr[i]value to  the k variable
			if(arr[i]==key) {
				k=i;
			}
		}
		System.out.println("Key last occured index is "+k);

	}

}
