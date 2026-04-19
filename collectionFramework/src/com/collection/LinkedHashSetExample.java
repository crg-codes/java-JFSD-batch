package com.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
		linkedHashSet.add("One");
		linkedHashSet.add("Two");
		linkedHashSet.add("Three");
		linkedHashSet.add("Four");
		linkedHashSet.add("Five");
		linkedHashSet.add("One");
		
		Iterator<String>  iterator=linkedHashSet.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		System.out.println(linkedHashSet.remove("Five"));
		
		linkedHashSet.addFirst("Start");
		linkedHashSet.addLast("End");
		
		System.out.println(linkedHashSet.contains("Five"));
		
		System.out.println(linkedHashSet.getFirst());
		System.out.println(linkedHashSet.getLast());
		
		
		System.out.println(linkedHashSet.size());

		
		

	}

}
