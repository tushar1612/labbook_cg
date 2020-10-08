package com.cg.lab3_String;
import java.util.Scanner;

public class Ex4_NumberModify {
	
		public int modifyNumber(int number1) 
		{
			String s1= Integer.toString(number1);
			StringBuffer sb=new StringBuffer();
			int modify;
			
			for(int i=0;i<s1.length()-1;i++)
			{
				int i1= (int) s1.charAt(i);
				int i2= (int) s1.charAt(i+1);
				int diff=Math.abs(i1-i2);
				sb.append(diff);
			}
			sb.append(s1.charAt(s1.length()-1));
			modify=Integer.parseInt(sb.toString());
			
			return modify;
		}
		
		public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int n = sc.nextInt();
			Ex4_NumberModify obj=new Ex4_NumberModify();
			System.out.println(obj.modifyNumber(n));
		}
}
