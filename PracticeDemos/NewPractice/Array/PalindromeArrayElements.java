package com.PracticeDemos.NewPractice.Array;

import java.util.Scanner;

public class PalindromeArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array length ");
		int[] arr = new int[sc.nextInt()];
		
		System.out.println("Enetr array elements ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Palindrome array elements are :");
		for (int i = 0; i <=arr.length-1; i++) {
			if(isPalindrome(arr[i])) {
				System.out.println(arr[i]);
			}
		}
		
		sc.close();
	}
	static boolean isPalindrome(int arr)
	{
		int rem=0,sum=0,n=arr;
		while(arr>0) {
			rem=arr%10;
			sum=sum*10+rem;
			arr/=10;
		}
		return n==sum;
	}
}
