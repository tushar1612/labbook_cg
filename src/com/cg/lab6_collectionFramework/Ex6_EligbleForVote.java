package com.cg.lab6_collectionFramework;
import java.util.*;

public class Ex6_EligbleForVote {
	
public List voterList(Map<String,Integer> originalMap){
		
		List<String> list = new ArrayList<String>();
		
		for(Map.Entry<String, Integer> e : originalMap.entrySet()) {
			if(e.getValue()>18) {
				list.add(e.getKey());
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("Rohit",19);
		map.put("Kapil",20);
		map.put("Vishal",16);
		map.put("Jatin",12);
		map.put("Shreyansh",11);
		map.put("Rajesh",60);
		
		Ex6_EligbleForVote e = new Ex6_EligbleForVote();
		
		List list = e.voterList(map);
		
		for(Object s  : list) {
			System.out.println(s);
		}
		
	}

}
