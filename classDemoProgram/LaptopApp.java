package com.classDemoProgram;

public class LaptopApp {

	public static void main(String[] args) {
		// Creating object of laptop class to access properties and behaviours
		Laptop lp=new Laptop();
		lp.snrNo=101;
		lp.brand="HP";
		lp.cost=20000;
		lp.switchOn();
		lp.switchOff();
		
		//creating one more object of Laptop class
		Laptop l1=new Laptop();
		l1.snrNo=102;
		l1.brand="Lenovo";
		l1.cost=3000;
		l1.switchOn();
		
		//this is calld Anonymous object it call only once and after calling the object is deleted quikly
		new Laptop().operate();
	}

}
