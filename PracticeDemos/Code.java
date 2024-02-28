package com.PracticeDemos;
//11-02-2024
import java.util.Scanner;
//ceating a clas to perforn calculation basic operations
class Calculater{
	public int addition(int a,int b) {
		return a+b;
	}
	public int substraction(int a,int b) {
			return a-b;
	}
	public int multiplication(int a,int b) {
		return a*b;
	}
	public int division(int a,int b) {
		return a/b;
	}
		
}
public class Code {
	//this is main class 
	public static void main(String[] args) {
		//Reading user input by creating Scanner class object
		Scanner sc=new Scanner(System.in);
		//creating object of calculater class
		Calculater calc=new Calculater();
		//creating veriable num and setting its value 1 iteration strt when n==1;
		int num=1;
		
		
		//Using while loop becuse its allow users to perform operation multiple time 
		while(num==1) {
			//asking user to enter no
			System.out.println("Enter numbers :");
			//Reading the values and storing it to a and b veriable
			int a=sc.nextInt();
			int b=sc.nextInt();
			//asking user to which operation you want to perform and the operands storing it to char datatype
			System.out.println("Enetr which opration you want to perform ( + , - , * , /)");
			char operand=sc.next().charAt(0);
			
			//using switch case it call methods when user enter is need
			switch(operand) {
			case '+': int add=calc.addition(a, b);
					System.out.println("Addition of "+a+" + "+b+" ="+add );
					break;
						
			case '-': int sub=calc.substraction(a, b);
				System.out.println("Substraction of "+a+" - "+b+" ="+sub );
				break;
				
			case '*': int mul=calc.multiplication(a, b);
				System.out.println("Multiplication of "+a+" * "+b+" ="+mul );
				break;
			
			case '/': int div=calc.substraction(a, b);
				System.out.println("Division of "+a+" / "+b+" ="+div );
				break;
			}
			//asking agian user to if they enter 1 then iterate ele leave the loop
			System.out.println("Do you want to continue press 1 else press other number");
			num=sc.nextInt();
			if(num!=1) {System.out.println("Thenk you...");
						}
		}
	}
}
