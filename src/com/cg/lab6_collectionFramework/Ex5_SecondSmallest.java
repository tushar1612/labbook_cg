package com.cg.lab6_collectionFramework;
import java.util.ArrayList;
import java.util.Collections;

public class Ex5_SecondSmallest {
		public int getSecondSmallest(int[] arr) {
				
				ArrayList<Integer> list = new ArrayList<Integer>();
				
				for(int i : arr) {
					list.add(i);
				}
				
				Collections.sort(list);
				return list.get(1);
			}
		
			public static void main(String[] args) {
				
				int[] arr = {1,9,3,4,5,6};
				
				Ex5_SecondSmallest e = new Ex5_SecondSmallest();
				int x = e.getSecondSmallest(arr);
				System.out.println("Second smallest element is : "+x);
			}

}
