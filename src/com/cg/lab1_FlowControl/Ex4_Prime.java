package com.cg.lab1_FlowControl;
import java.util.Scanner;

public class Ex4_Prime {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		int n=sc.nextInt();
		int flag=0;
		System.out.println("Prime numbers upto "+n+" are :");
		for(int i=3;i<=n;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
					flag=1;
			}
			if(flag==1)
			{
				System.out.println(i);
			}
		}
	}

}
