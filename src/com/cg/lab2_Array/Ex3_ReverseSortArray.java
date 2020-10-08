package com.cg.lab2_Array;
import java.util.Scanner;

public class Ex3_ReverseSortArray {
	public int[] getSorted(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			Integer integer=arr[i];
			String str=integer.toString();
			StringBuffer sb=new StringBuffer(str);
			sb=sb.reverse();
			String str1=new String(sb);
			arr[i]=Integer.parseInt(str1);
			
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=scan.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			array[i]=scan.nextInt();
		}
		Ex3_ReverseSortArray ob=new Ex3_ReverseSortArray();
		int[] x=ob.getSorted(array);
		for(int i=0;i<n;i++)
		{
			System.out.println(x[i]);
		}
		
	}

}
