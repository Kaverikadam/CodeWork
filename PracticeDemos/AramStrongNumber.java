package com.PracticeDemos;

import java.util.Scanner;

public class AramStrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int rem=0,sum=0,num=n;
		while(n>0) {
			rem=n%10;
			sum=sum+(int)Math.pow(rem, 3);
			n=n/10;
		}
		if(num==sum) {
			System.out.println(" is armstrong number");
		}
		else {
			System.out.println("is not a armstrong number");
		}
		
		isArm();

	}
	public static void isArm() {
	
        int number = 1634, originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
	
}
