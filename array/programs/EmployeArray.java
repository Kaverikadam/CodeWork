package com.array.programs;

public class EmployeArray {
	public static void main(String[] args) {
		// Creating array of 5 data elements
		String[] eName=new String[7];
		//storing array values
		eName[0]="Kaveri";
		eName[1]="Pratik";
		eName[2]="Sushant";
		eName[3]="Rakesh";
		eName[4]="Daanu";
		eName[5]="Kiran";
		eName[6]="Komal";
		System.out.println("Name of employees : ");
		//Displaying the array elements
		for(int i=0;i<=eName.length-1;i++) {
			System.out.println(eName[i]);
		}
		//Displaying length of array
		System.out.println("Length of array : "+eName.length);
		
		
	}
}
