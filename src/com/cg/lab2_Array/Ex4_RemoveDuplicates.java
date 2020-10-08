package com.cg.lab2_Array;
import java.util.Scanner;
import java.util.Arrays;

public class Ex4_RemoveDuplicates {
	
		public int removeDuplicates(int arr[], int n) 
		{     
	        if (n==0 || n==1) 
	            return n; 
	        int[] temp = new int[n]; 
	        int j = 0; 
	        Arrays.sort(arr);
	        
	        for (int i=0; i<n-1; i++) 
	        {
	            if (arr[i] != arr[i+1]) 
	                temp[j++] = arr[i];
	        	
	        } 
	        temp[j++] = arr[n-1];    
	   
	        for (int i=0; i<j; i++)
	        {
	            arr[i] = temp[i];
	        }
	     
	     return j; 
	    } 
	
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter no of elements");
			int n=scan.nextInt();
			int[] arr=new int[n];
			System.out.println("Enter the elements");
			for(int i=0;i<n;i++)
			{
				arr[i]=scan.nextInt();
			}
			Ex4_RemoveDuplicates obj=new Ex4_RemoveDuplicates();
			
	        int x = obj.removeDuplicates(arr, n); 
	        for (int i=0; i<x; i++) 
	           System.out.print(arr[i]+" "); 
			
		}
}
