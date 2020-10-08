package com.cg.lab1_FlowControl;
import java.util.Scanner;

public class Ex6_DiffOfSquares {
	
	public int calculateDifference(int n)
	{
		int diff=0, sum=0, sum1=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(i*i);
			sum1=sum1+i;
		}
		diff=sum-(sum1*sum1);
		return diff;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		
		Ex6_DiffOfSquares obj1=new Ex6_DiffOfSquares();
		int d=obj1.calculateDifference(x);
		System.out.println("Difference : "+d);
	}

}
