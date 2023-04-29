package com.gl.oops;

import java.util.Scanner;

public class Employee {
	
	String employeeId;
	String employeeName;
	String employeeAddress;
	int employeeSalary;
	
	Scanner scan1 = new Scanner(System.in);
	
	public void acceptEmployeeDetails()
	{
		System.out.println("Enter the Employee Details ");
		System.out.println("Enter the Employee Id ");
		employeeId = scan1.next();
		System.out.println("Enter the Employee Name ");
		employeeName = scan1.next();
		System.out.println("Enter the Employee Address");
		employeeAddress = scan1.next();
		
		System.out.println("Enter the Employee Salary");
		employeeSalary = scan1.nextInt();
		
	}
	
	public void displayEmployeeDetails()
	{
		System.out.println("The Employee Details are ");
		System.out.println("Employee Id "+employeeId);
		System.out.println("Employee Name "+employeeName);
		System.out.println("Employee Address "+employeeAddress);
		System.out.println("Employee Salary "+employeeSalary);
	}

}
