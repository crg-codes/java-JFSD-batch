package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	
	public static List<List<String>> groupAnagrams(String strs[])
	{
		Map<String,List<String>> map=new HashMap<String, List<String>>();
		
		
		for(String word:strs)
		{
			char chars[]=word.toCharArray();
			Arrays.sort(chars);
			
			String key=new String(chars);
			map.putIfAbsent(key, new ArrayList<String>());
			map.get(key).add(word);
		}
		
		
		return new ArrayList<List<String>>(map.values());
	}

	public static void main(String[] args) {
		
		String words[]= {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(words));

	}

}

/*
 * aet -> [eat,tea,ate]
 * ant -> [tan,nat]
 * abt -> [bat]
 * */


