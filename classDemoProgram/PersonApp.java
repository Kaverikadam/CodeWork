package com.classDemoProgram;

public class PersonApp {

	public static void main(String[] args) {
		// Creating object of person class
		Person p1=new Person();
		p1.disply();
		
		System.out.println("----------------------------");
		Person p2=new Person("Prateek",22);
		p2.disply();
		
		System.out.println("----------------------------");
		Person p3=new Person("Rakesh",24,"Male");
		p3.disply();
		
		System.out.println("----------------------------");
		Person p4=new Person("sushant",25,50000,"male");
		p4.disply();
		
		System.out.println("----------------------------");
		//Anonymous object which is also used with constructors
		new Person("Kiran",24,60000,"Female").disply();
	}

}
