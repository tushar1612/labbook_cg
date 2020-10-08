package com.cg.lab6_collectionFramework;
import java.util.Map;
import java.util.HashMap;


public class Ex4_StudentsMedal {
	
public HashMap<String,String> getStudents(Map<String,Integer> originalMap){
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		for(Map.Entry<String, Integer> m : originalMap.entrySet()) {
			if(m.getValue()>=90) {
				map.put(m.getKey(),"Gold");
			}
			else if(m.getValue()>=80) {
				map.put(m.getKey(),"Silver");
			}
			else if(m.getValue()>=70) {
				map.put(m.getKey(),"Bronze");
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("Rohit",100);
		map.put("Kapil",90);
		map.put("Vishal",60);
		map.put("Jatin",75);
		map.put("Shreyansh",88);
		map.put("Rahul",40);
		
		Ex4_StudentsMedal e = new Ex4_StudentsMedal();
		Map<String,String> m = e.getStudents(map);
		
		for(Map.Entry<String, String> mm : m.entrySet()) {
			System.out.println("Student : "+mm.getKey()+"    Medal : "+mm.getValue());
		}
	}

}
