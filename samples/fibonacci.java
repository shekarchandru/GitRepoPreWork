package com.gl.samples;

public class fibonacci {

	public int fib(int n) 
	{
		   if (n <= 1)
		      return n;
		   return fib(n-1) + fib(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 1;
		int arr[] = new int[5];
		arr[0] = 0;
		arr[1] = 1;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		for(int i=2;i<5;i++)
		{
			arr[i] = arr[i-1]+arr[i-2];
			System.out.println(arr[i]);
		}
		
		fibonacci fibo = new fibonacci();
		System.out.println("----------");
		System.out.println(fibo.fib(4));

	}

}
