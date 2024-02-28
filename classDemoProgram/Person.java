package com.classDemoProgram;

public class Person {

	String name;
	int age;
	float salary;
	String gender;
	void disply() {
		System.out.println("Person name: "+name);
		System.out.println("Person age: "+age);
		System.out.println("Person salary: "+salary);
		System.out.println("Person gender: "+gender);
	}
	Person(){
		 name="kaveri";
		 age=22;
		 salary=5000.8f;
		 gender="Female";
		
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	Person(String name,int age,String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	Person(String name,int age,float salary,String gender){
		this.age=age;
		this.name=name;
		this.salary=salary;
		this.gender=gender;
	}
	

}
