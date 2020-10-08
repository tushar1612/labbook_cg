package com.cg.lab2_Array;
import java.util.Scanner;

public class Ex1_SecondSmallestElement {
	
	public int getSecondSmallest(int[] array)
	{
		int temp;

		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}	
			}
		}
		return array[1];
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=scan.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			array[i]=scan.nextInt();
		}
		
		Ex1_SecondSmallestElement obj=new Ex1_SecondSmallestElement();
		int x=obj.getSecondSmallest(array);
		System.out.println("Second smallest element: "+x);
	}

}
