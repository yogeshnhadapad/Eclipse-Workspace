package com.ifcondition;

import java.util.Scanner;

public class PositiveNegetive {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		
		if (x < 0)
			System.out.println("Number is negative..");
		else if (x > 0)			
			System.out.println("Number is positive....");
		else
			System.out.println("Number is zero...");

	}

}
