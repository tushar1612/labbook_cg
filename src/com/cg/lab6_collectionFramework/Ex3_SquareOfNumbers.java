package com.cg.lab6_collectionFramework;
import java.util.Map;
import java.util.HashMap;
//import java.util.*;

public class Ex3_SquareOfNumbers {	

		public Map<Integer,Integer> getSquares(int[] arr)
		{
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			for(int i : arr) 
			{
				map.put(i,i*i);
			}
		return map;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrnum = {1,2,3,4,5};
		Ex3_SquareOfNumbers e = new Ex3_SquareOfNumbers();
		Map<Integer,Integer> map = e.getSquares(arrnum);
		
		for(Map.Entry<Integer, Integer> m: map.entrySet()) 
		{
			System.out.println("number :"+m.getKey()+" its square : "+m.getValue());
		
		}

}
}