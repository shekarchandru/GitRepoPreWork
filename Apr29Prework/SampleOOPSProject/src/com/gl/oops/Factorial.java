package com.gl.oops;

public class Factorial {
	
	public int findfactorialWithOutRecursion(int num)
	{ 
		int factorial=1;
		for(int i=1;i<=num;i++)
		{
		 factorial = factorial * i;
		}
		return factorial;
	}
	public int findfactorialWithRecursion(int num)
	{
		if(num == 0 || num == 1)
		{
			return 1;
		}
		return num * findfactorialWithRecursion(num-1);
	}

}
