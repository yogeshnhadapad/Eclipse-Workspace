package com.java.basics;

public class Division {
public static void main(String args[]) {
		
		int num1 = 10, num2 = 0;
		
		try {
			int result = num1/num2;
			System.out.println("the result is"+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("can't divided by zero" + e);
		}
		finally {
			System.out.println("finally block is executed");
		}
}
}