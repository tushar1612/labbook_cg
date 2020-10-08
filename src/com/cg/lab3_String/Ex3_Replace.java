package com.cg.lab3_String;
import java.util.Scanner;

public class Ex3_Replace {
	
	public String alterString(String str) {
		String str1="";
		
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'||
				str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
				str1= str1+str.charAt(i);
			else
				str1= str1+(char) ((int)str.charAt(i)+1);
			
		}
		return str1;
	}
	
	public static void main(String[] args)
	{	
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = scan.next();
		Ex3_Replace obj=new Ex3_Replace();
		System.out.println(obj.alterString(s1));
	}
}
