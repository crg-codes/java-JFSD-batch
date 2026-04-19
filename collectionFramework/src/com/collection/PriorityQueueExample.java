package com.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<String> priorityQueue=new PriorityQueue<String>();
		
		priorityQueue.add("Amit");
		priorityQueue.add("Vijay");
		priorityQueue.add("Karan");
		priorityQueue.add("Jai");
		priorityQueue.add("Rahul");
		
		
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue.element());
		
		
		Iterator<String> iterator=priorityQueue.iterator();
		
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		priorityQueue.remove();
		priorityQueue.poll();
		
		System.out.println();
		
		iterator=priorityQueue.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}	

	}

}
