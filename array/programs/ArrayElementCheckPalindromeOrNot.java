package com.array.programs;

import java.util.Scanner;

public class ArrayElementCheckPalindromeOrNot {

	public static void main(String[] args) {
		//Creating object of scanner class
		Scanner sc=new Scanner(System.in);
		//asking user to enter array length
		System.out.println("Enter array length :");
		int[] arr=new int [sc.nextInt()];
		
		//Reding the array elements using for loop
		System.out.println("Enter array elements :");
		for(int i=0;i<=arr.length-1;i++) {
			//storing the array elements in array
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Palindrome numbers in array :");
		
		for(int i=0;i<arr.length;i++) {
			//calling isPalindrome method and passing the array element as argument
			if(isPalindrome(arr[i])) {
				System.out.println(arr[i]);
			}
		}
						
	}
	//creating method to perform palindrome operation
	static boolean isPalindrome(int num) {
		int rem=0,sum=0,n=num;
		while(num>0) {
			//calculating last digit
			rem=num%10;
			//storing the reminder in sum variable
			sum=sum*10+rem;
			//removing last element
			num/=10;	
		}
		//returning true if sum is equals to n
		return n==sum;
	}
}
