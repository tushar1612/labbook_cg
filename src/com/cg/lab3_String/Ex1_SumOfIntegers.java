package com.cg.lab3_String;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1_SumOfIntegers {
	
		public static void main(String [] args)
		{
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter line of integers");
			String str=scan.nextLine();
			StringTokenizer st= new StringTokenizer(str," ");
			int sum=0;
			while(st.hasMoreTokens())
			{
				String s1= st.nextToken();
				int i=Integer.parseInt(s1);
				sum = sum+i; 
				System.out.println(s1);
				
			}
			System.out.println("Sum of all integers "+sum);
			
		}


}
