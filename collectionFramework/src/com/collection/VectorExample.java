package com.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<Integer> integers=new Vector<Integer>();
		integers.add(11);
		integers.add(22);
		integers.add(33);
		integers.add(44);
		integers.add(55);
		integers.add(66);
		
		System.out.println(integers.size());
		System.out.println(integers.set(1,77));
		System.out.println(integers.elementAt(4));
		System.out.println(integers.firstElement());
		System.out.println(integers.indexOf(55));
		integers.remove(0);
		
		Iterator<Integer> iterator=integers.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}
