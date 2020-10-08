package com.cg.lab6_collectionFramework;
import java.util.*;

public class Ex7_ReverseAndSort {
	
	public int[] getSorted(int[] arr) {
		for(int i = 0;i<arr.length;i++) 
		{
			Integer integer = arr[i];
			String s = integer.toString();
			StringBuilder sb = new StringBuilder(s);
			sb.reverse();
			String newstr = sb.toString();
			arr[i] = Integer.parseInt(newstr);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {					//for(i:arr)
			list.add(arr[i]);							//list.add(i);
		}
		
		Collections.sort(list);
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = list.get(i);
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {12,32,58,14,18,21};
		
		Ex7_ReverseAndSort e = new Ex7_ReverseAndSort();
		int arr1[] = e.getSorted(arr);
		
		for(int i : arr1) {
			System.out.println(i);
		}
	}

}
