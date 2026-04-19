package com.collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		
		linkedList.add(12);
		linkedList.add(22);
		linkedList.add(32);
		linkedList.add(42);
		linkedList.addFirst(11);
		linkedList.addLast(89);
		
		
		for(Integer obj:linkedList)
		{
			System.out.println(obj);
		}
		
		linkedList.set(0, 77);
		linkedList.remove();
		System.out.println(linkedList.contains(88));
		System.out.println(linkedList.isEmpty());
		System.out.println(linkedList.get(0));
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.indexOf(89));
		System.out.println(linkedList.offer(99));
		System.out.println(linkedList.size());
		System.out.println(linkedList.peek());
		System.out.println(linkedList.poll());
		System.out.println(linkedList.pop());
		
	}

}
