package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> hashSet=new HashSet<String>();
		
		hashSet.add("One");
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("Four");
		hashSet.add("Five");
		
		
		Iterator<String> iterator=hashSet.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println(hashSet.contains("Four"));
		System.out.println(hashSet.remove("Five"));
		System.out.println(hashSet.isEmpty());
		System.out.println(hashSet.size());
		System.out.println(hashSet.clone());
		hashSet.clear();
		
		
		
	}

}
