package com.PracticeDemos;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a array length :");
		int[] arr=new int[sc.nextInt()];
		
		System.out.println("Enter array length :");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int pos=i;
				int min=arr[i];
				if(arr[j]>min) {
					min=arr[j];
					pos=j;
				}
				int temp =arr[pos];
				arr[pos]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println("Sorted array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
