package com.gl.oops;

import java.util.Scanner;

public class Fibonacci {

	public void findFibonacci()
	{
		 Scanner scan1 = new Scanner(System.in);

		    System.out.print("Enter number: ");
		    int num1 = scan1.nextInt();
		 //   int ent = Integer.parseInt(enter);

		    int total1 = 0;
		    int total2 = 1;
		    int total3 = 0;

		    for (int i = 0; i < num1; i++) {
		        if (i <= 1) {
		            System.out.print(" " + total3);
		            total3 = total1 + total2;

		        } else if (i == 2) {
		            System.out.print(" " + total3);
		        } else {
		            total1 = total2;
		            total2 = total3;
		            total3 = total1 + total2;
		            System.out.print(" " + total3);

		        }
		    }
	}
}
