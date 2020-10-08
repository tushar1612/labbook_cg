package com.cg.lab1_FlowControl;
import java.util.Scanner;

public class Ex1_SumOfCubes {
	public static void main(String args[])
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		
		while(num>0)
		{
			int digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		System.out.println("Sum of cubes of digits of number: "+sum);
	}

}
