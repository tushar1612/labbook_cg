package com.cg.lab6_collectionFramework;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ex1_SortedList {
	public List<String> getValues(Map<Integer,String> map){
			
			List<String> list = new ArrayList<String>();
			
			for(Map.Entry<Integer, String> entry : map.entrySet()) {
				list.add(entry.getValue());
			}
			
			Collections.sort(list);
			return list;
		}
		
		public static void main(String[] args) {
			
			Map<Integer,String> map = new HashMap<Integer,String>();
			map.put(1, "Gaurav");
			map.put(2, "Rohit");
			map.put(3,"Harshit");
			
			Ex1_SortedList e = new Ex1_SortedList();
			List<String> mylist = e.getValues(map);
			
			for(String s  : mylist) {
				System.out.println(s);
			}
		}
}
