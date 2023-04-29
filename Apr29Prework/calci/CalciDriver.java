package com.gl.calci;

public class CalciDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal1 = new Calculator();
		cal1.calculateSquare();
		
		int myProduct = cal1.calculateProduct(20, 1000);
		System.out.println("The Product of your NUmbers is "+myProduct);

	}

}
