package com.gl.calci;

import java.util.Scanner;

public class Calculator {
	Scanner scan1 = new Scanner(System.in);
	public void calculateSquare()
	{
		int num1;
		System.out.println("Enter a Number ");
		num1 = scan1.nextInt();
		int square = num1 * num1;
		System.out.println("The Square of your number is "+square);
		
	}
	public int calculateProduct(int value1, int value2)
	{
		int product = value1 * value2;
		System.out.println("The Product of the Numbers is "+product);
		return product;
	}

}
