package com.whileloop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		
		int i=1;
		while ( i <= 10)
		{
			System.out.println(x + " * " + i + " = "+i * x);
			 ++i;
		}

	}

}
