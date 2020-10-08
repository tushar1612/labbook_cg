package com.cg.lab5_ExceptionHandling;
import java.util.Scanner;


class Name extends Exception
{
	Name(String msg)
	{
		System.out.println(msg);
	}
}

public class Ex2_ValidateName {
	
	public void checkName() throws Name
	{
//		Scanner scan=new Scanner(System.in);
		String s1="gaurav";
		String s2=null;
		
		if(s1==null||s2==null)
			throw new Name("Not Valid");
		else
			System.out.println("Valid");
	}
	
	public static void main(String[] args)
	{
		try {			
			Ex2_ValidateName va=new Ex2_ValidateName();
			va.checkName();
		}
		catch(Exception e)
		{
			System.out.println("I can handle userdefine exception"+e);
		}
}

}



