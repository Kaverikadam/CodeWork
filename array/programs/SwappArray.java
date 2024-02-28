package com.array.programs;

import java.util.Scanner;

public class SwappArray {

	/*Swapping done in this way when you enter position that position
	to arr.length-1 all elements are swap in first position and remaining 
	fist elements are swapped at first last position*/
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length");
		int[] arr=new int[sc.nextInt()];
		int[] arr1=new int[arr.length];
		System.out.println("Enter arra elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nEnetr position where swapping is happen");
		int n=sc.nextInt();
		int N=arr.length;
		int ptr=0,ptr2=n,temp;
		
		while(ptr2<N) {
			temp=arr[ptr];
			arr[ptr]=arr[ptr2];
			arr[ptr2]=temp;
			++ptr;
			++ptr2;
		}
		
		System.out.println("\nArray swapped elements :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
