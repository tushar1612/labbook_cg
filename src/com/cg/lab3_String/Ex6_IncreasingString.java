package com.cg.lab3_String;
import java.util.Scanner;

public class Ex6_IncreasingString {
	
		public boolean positiveString(String str)
		{
			int flag=0;
			for(int i=0; i<str.length()-1;i++)
			{
				int a=(int) str.charAt(i);
				int b=(int) str.charAt(i+1);
				if(a<b)
					flag=1;
				else
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				return true;
			else
				return false;
		}
		
		public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string");
			String str1=sc.next();
			Ex6_IncreasingString ob=new Ex6_IncreasingString();
			System.out.println(ob.positiveString(str1));
		}
}


