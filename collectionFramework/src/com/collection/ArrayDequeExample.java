package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		
		Deque<String> deque=new ArrayDeque<String>();
		
		deque.add("Amit");
		deque.add("Vijay");
		deque.add("Ravi");
		deque.add("Nayan");
		deque.add("Kiran");
		
		for(String name:deque)
		{
			System.out.println(name);
		}
		
		deque.offer("Manoj");
		deque.offerFirst("Komal");
		deque.offerLast("Ishita");
		
		
		
		System.out.println();
		for(String name:deque)
		{
			System.out.println(name);
		}

		System.out.println(deque.poll());
		System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        
        
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

	}

}
