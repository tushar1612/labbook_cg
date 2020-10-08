package com.cg.lab5_ExceptionHandling;

import java.util.Scanner;

class Age extends Exception
{
	Age(String msg)
	{
		System.out.println(msg);
	}
}
public class Ex1_ValidateAge {
	Scanner scan=new Scanner(System.in);
	int age=scan.nextInt();
	public void checkAge() throws Age
	{
		if(age<15)
			throw new Age("Not Eligible. Age of person should be above 15");
		else
			System.out.println("Eligible");
	}
	
	public static void main(String[] args)
	{
		try {
			System.out.println("Enter the age");
			Ex1_ValidateAge va=new Ex1_ValidateAge();
			va.checkAge();
		}
		catch(Exception e)
		{
			System.out.println("I can handle userdefine exception"+e);
		}
	}
	
	

}
