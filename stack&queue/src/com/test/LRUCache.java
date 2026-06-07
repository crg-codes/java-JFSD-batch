package com.test;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	
	class Node
	{
		int key;
		int value;
		
		Node pre;
		Node next;
		
		Node(int key,int value)
		{
			this.key=key;
			this.value=value;
		}
			
	}
	
	private int capacity = 0;
	private  Map<Integer, Node> map;
	
	private  Node head ;
	private  Node tail ;
	
	LRUCache(int capacity)
	{
		this.capacity=capacity;
		this.map=new HashMap<>();
		
		head=new Node(0,0);
		tail=new Node(0,0);
		
		head.next=tail;
		tail.pre=head;
		
	}
	
	
	private void addFirst(Node node)
	{
		node.next=head.next;
		node.pre=head;
		
		head.next.pre=node;
		head.next=node;
		
	}
	
	
	private void remove(Node node)
	{
		node.pre.next=node.next;
		node.next.pre=node.pre;
	}
	
	
	private void moveToFront(Node node)
	{
		remove(node);
		addFirst(node);
	}
	
	public int get(int key)
	{
		if(!map.containsKey(key))
		{
			return -1;
		}
		
		Node node=map.get(key);
		moveToFront(node);
		
		
		return node.value;
		
	}
	
	
	public void put(int key,int value)
	{
		if(map.containsKey(key))
		{
			Node node=map.get(key);
			node.value=value;
			
			moveToFront(node);
			
			return;
		}
		
		Node node=new Node(key, value);
		map.put(key, node);
		
		addFirst(node);
		
		if(map.size()>capacity)
		{
			Node lru=tail.pre;
			remove(lru);
			map.remove(lru.key);
		}
		
		
	}
	
	public void displayCache()
	{
		Node current=head.next;
		
		System.out.println("Cache: ");
		
		while(current!=tail)
		{
			System.out.println("("+current.key+", "+current.value+") ");
			current=current.next;
		}
		
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		
		LRUCache cache=new LRUCache(3);
		
		cache.put(1, 10);
		cache.put(2, 20);
		cache.put(3, 30);
		
		cache.displayCache();
		
		cache.get(2);
		
		cache.displayCache();
		
		cache.put(4, 40);
		
		cache.displayCache();
		

		

	}

}
