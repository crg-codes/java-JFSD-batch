package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HaspMapExample {

	public static void main(String args[])
	{
		Map<String, Long> map=new HashMap<String, Long>();
		HashMap<String, Long> map2=new HashMap<String, Long>();
		
		
		map.put("Ajay", 938737373L);
		map.put("Naman", 878737373L);
		map.put("Ratan", 635337373L);
		map.put("Kumar",546466646L);
		
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+": "+m.getValue());
		}
		
		map.remove("Ratan",635337373L);
		
		System.out.println(map.containsKey("Kumar"));
		System.out.println(map.containsValue(938737373L));
		
		System.out.println(map.get("Naman"));
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.size());
		
		System.out.println(map.replace("Kumar", 3974937L));
	}
}
