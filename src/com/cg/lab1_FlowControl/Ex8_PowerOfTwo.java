package com.cg.lab1_FlowControl;
import java.util.Scanner;

public class Ex8_PowerOfTwo {
	
	//	boolean checkNumber(int n)
	//	{
	//		boolean b=false;
	//		for(int i=1;i<n;i++)
	//		{
	//			if(n==(2^i)) {
	//				b=true;
	//				break;
	//			}
	//			else
	//				b=false;
	//		}
	//		return b;
	//	}
		
		boolean checkNumber(int n)
		{
			boolean b=false;
			while(n!=1)
			{
				if(n%2==0)
					b=true;
				else {
					b=false;
					break;
				}
				n=n/2;
			}
			return b;
		}
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the number");
			int number=scan.nextInt();
			Ex8_PowerOfTwo obj=new Ex8_PowerOfTwo();
			System.out.println(obj.checkNumber(number));
		}

}
