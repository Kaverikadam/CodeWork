package com.PracticeDemos.NewPractice.Array;

import java.util.Scanner;

public class GCDofArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array length ");
		int[] arr = new int[sc.nextInt()];
		
		System.out.println("Enetr array elements ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int gcd=1;
		for (int i = 1; i < arr.length; i++) {
			if(arr[0]%i==0 && arr[arr.length-2]%i==0) {
				gcd=i;
				
			}
			
		}
		System.out.println("GCD of "+arr[0]+" and "+arr[arr.length-2]+" :"+gcd);
		

	}

}
