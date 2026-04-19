package com.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> linkedHashMap=new LinkedHashMap<Integer, String>();
		
		linkedHashMap.put(11, "Anil");
		linkedHashMap.put(22,"Kumar");
		linkedHashMap.put(33,"Manoj");
		linkedHashMap.put(44,"Saran");
		linkedHashMap.put(55,"Kavita");
		linkedHashMap.put(null,"Sunita");
		linkedHashMap.put(66,null);
		linkedHashMap.put(77,null);
		
		
		System.out.println(linkedHashMap.containsKey(77));
		System.out.println(linkedHashMap.containsValue(null));
		
		for(Map.Entry m:linkedHashMap.entrySet())
		{
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
		System.out.println(linkedHashMap.keySet());
		System.out.println(linkedHashMap.values());
		
		
		System.out.println(linkedHashMap);
	    linkedHashMap.remove(44);
		System.out.println(linkedHashMap);
		
		
		System.out.println(linkedHashMap.get(33));
		
		linkedHashMap.clear();
		linkedHashMap.clone();
		
	}

}
