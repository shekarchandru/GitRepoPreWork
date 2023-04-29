package com.gl.oops;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial factorial = new Factorial();
	int resultFactorial1  =	factorial.findfactorialWithOutRecursion(5);
	System.out.println("The Factorial for 5 is "+resultFactorial1);
	
	int resultFactorial2 = factorial.findfactorialWithRecursion(5);
	System.out.println("The Factorial for 5 with Recursion is "+resultFactorial2);
	
	System.out.println("Calling Fibonacci Series function");
	Fibonacci fibo1 = new Fibonacci();
	fibo1.findFibonacci();
	
	System.out.println("Printing Tables ");
	MultiplicationTable table1 = new MultiplicationTable();
	table1.displayTable(6);
	
	}

}
