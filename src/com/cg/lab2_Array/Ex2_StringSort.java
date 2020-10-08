package com.cg.lab2_Array;
import java.util.Scanner;
import java.util.Arrays;

public class Ex2_StringSort {
	
	public String[] sortStrings(String[] arr)
	{

		Arrays.sort(arr);
		if(arr.length%2==0)
		{
			for(int i=0;i<arr.length/2;i++)
			{
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=arr.length/2;i<arr.length;i++)
			{
				arr[i]=arr[i].toLowerCase();
			}
		}
		else
		{
			for(int i=0;i<arr.length/2+1;i++)
			{
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=arr.length/2+1;i<arr.length;i++)
			{
				arr[i]=arr[i].toLowerCase();
			}
		}

		return arr;
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=scan.nextInt();
		String[] array=new String[n];
		for(int i=0;i<n;i++)
		{
			array[i]=scan.next();
		}
		
		Ex2_StringSort obj=new Ex2_StringSort();
		String[] x=obj.sortStrings(array);
		for(int i=0;i<n;i++)
			System.out.println(x[i]);
	}

}
