package com.cg.lab1_FlowControl;
import java.util.Scanner;

public class Ex5_SumOfNumbers {
	
	public int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=scan.nextInt();
		
		Ex5_SumOfNumbers obj=new Ex5_SumOfNumbers();
		int sum1=obj.calculateSum(x);
		System.out.println("Sum : "+sum1);
	}

}
