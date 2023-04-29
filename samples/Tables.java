package com.gl.samples;

public class Tables {
	public void table1(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num +" X "+i+" = "+(num * i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tables tables = new Tables();
		tables.table1(120);
	}

}
