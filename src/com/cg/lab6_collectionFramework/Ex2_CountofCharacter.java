package com.cg.lab6_collectionFramework;
import java.util.HashMap;
import java.util.Map;

public class Ex2_CountofCharacter {
	
	public Map<Character,Integer> countChars(char[] arr)
	{
			Map<Character,Integer> map = new HashMap<Character, Integer>();
			int count = 0;
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++) {
					if(arr[i] == arr[j]) 
					{
						count+=1;
					}
				}
				if(map.containsKey(arr[i])) {
					count=0;
					continue;
				}
				map.put(arr[i],count);
				count=0;
			}
			return map;
		}
		
		public static void main(String[] args) 
		{	
		
			char[] arr = {'a','a','b','c','c','d','d','d','e'};
			
			Ex2_CountofCharacter e = new Ex2_CountofCharacter();
			Map<Character,Integer> map = e.countChars(arr);
			
			for(Map.Entry<Character, Integer> m: map.entrySet())
			{
				System.out.println(m.getKey()+": "+m.getValue()+" times");
			}
			
		}

}
