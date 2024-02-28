package com.array.programs;

public class ArrayMergingDemo {

	public static void main(String[] args) {
		//creating arrays 
		int[] array= {2,3,5};
		int[] array2= {4,1,8,7};
		int [] array3=new int[array.length+array2.length];
		//adding array 1 elements in array 3
		for(int i=0;i<array.length;i++) {
			array3[i]=array[i];
		}
		//adding array 2 alements in array 3
		for(int i=0;i<=array2.length-1;i++) {
			
			array3[array.length+i]=array2[i];
		}
		//displying araay elements
		for( int i=0;i<array3.length;i++) {
			System.out.print(array3[i]+", ");
		}
		
	}

}
