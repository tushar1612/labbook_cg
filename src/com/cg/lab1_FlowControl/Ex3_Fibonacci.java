package com.cg.lab1_FlowControl;
import java.util.Scanner;

public class Ex3_Fibonacci {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int a=1,b=1;
		int c=0;
		System.out.println("Enter n");
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
		
	}

}
