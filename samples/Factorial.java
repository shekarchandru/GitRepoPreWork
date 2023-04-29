package com.gl.samples;

public class Factorial {
	public int factorialRL(int num)
	{ 
		int factorial=1;
		for(int i=1;i<=num;i++)
		{
		 factorial = factorial * i;
		}
		return factorial;
	}
	public int factorial(int num)
	{
		if(num == 0 || num == 1)
		{
			return 1;
		}
		return num * factorial(num-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		Factorial fact = new Factorial();
		System.out.println(fact.factorial(x));
		System.out.println("----------------");
		System.out.println(fact.factorialRL(x));
		

	}

}
