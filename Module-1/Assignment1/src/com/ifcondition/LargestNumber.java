package com.ifcondition;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two numbers...");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x > y)
			System.out.println("Largest is "+ x);
		else
			System.out.println("Largest is "+ y);

	}

}