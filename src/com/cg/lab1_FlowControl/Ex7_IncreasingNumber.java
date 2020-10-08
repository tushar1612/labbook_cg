package com.cg.lab1_FlowControl;
import java.util.Scanner;

public class Ex7_IncreasingNumber {
	
	boolean checkNumber(int number)
	{
		int flag=0;
		boolean b=false;
		while(number>0)
		{
			int digit=number%100;
			int d1=digit%10;
			int d2=digit/10;
			if(d1>=d2)
				flag=1;
			else
			{
				flag=0;
				break;
			}	
			number=number/10;
		}
		if(flag==1)
			b=true; 
		return b;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		Ex7_IncreasingNumber obj=new Ex7_IncreasingNumber();
		System.out.println(obj.checkNumber(n));
	}

}
