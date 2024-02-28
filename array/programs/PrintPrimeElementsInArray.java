package com.array.programs;

import java.util.Scanner;

public class PrintPrimeElementsInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr array size");
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enetr array elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<arr.length;i++) {
			boolean isPrime=true;
			for(int j=2;j<arr[i];j++) {
				//count++;
				if(arr[i]%j==0) {
					//count++;
					isPrime=false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println(arr[i]+" is a palindrome...");
			}
			
		}
	}

}
