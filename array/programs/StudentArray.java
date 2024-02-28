package com.array.programs;

import java.util.Scanner;

class Students{
	String name;
	int age;
	String gender;
	void eat() {
		System.out.println("Student is eating");
	}
	void sleep() {
		System.out.println("Student is sleeping");
	}
	void study() {
		System.out.println("Student is studying");
	}
	public Students(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
}
public class StudentArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array :");
		Students[] arr=new Students[sc.nextInt()];
		
		System.out.println("Eneter student Details name, age, gender and marks");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=new Students(sc.next() , sc.nextInt(), sc.next());
		}
		System.out.println("Student Details is:");

		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i].name+ " "+arr[i].age+" " +arr[i].gender+"\n"
					+ "");
			
		}
	}

}


















