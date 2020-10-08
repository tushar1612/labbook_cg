package com.cg.lab5_ExceptionHandling;

import java.util.Scanner;

class Salary extends Exception
{
	Salary(String msg)
	{
		System.out.println(msg);
	}
}
public class Ex3_EmployeeException {
	Scanner scan=new Scanner(System.in);
	int salary=scan.nextInt();
	public void checkSlry() throws Salary
	{
		if(salary<3000)
			throw new Salary("Salary should be above 3000");
		else
			System.out.println("Eligible");
	}
	
	public static void main(String[] args)
	{
		try {
			System.out.println("Enter the salary");
			Ex3_EmployeeException va=new Ex3_EmployeeException();
			va.checkSlry();
		}
		catch(Exception e)
		{
			System.out.println("I can handle userdefine exception"+e);
		}
	}
	
	

}
