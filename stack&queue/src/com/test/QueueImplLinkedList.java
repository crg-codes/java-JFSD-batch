package com.test;

import com.test.StackImplUsingLinkedList.Node;

public class QueueImplLinkedList {

	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	private Node front;
	private Node rear;
	private int size;
	
	public void enqueue(int value)
	{
		Node node=new Node(value);
		
		if(rear==null)
		{
			front=rear=node;
			return;
		}
		
		rear.next=node;
		rear=node;
		size++;
	}
	
	public int dequeue()
	{
		if(front==null)
		{
			return -1;
		}
		
		int value=front.data;
		front=front.next;
		
		if(front==null)
			rear=null;
		
		size--;
		
		return value;
	}
	
	public int peek()
	{
		if(front==null)
		{
			System.out.println("Empty Queue!");
		}
		
		int value=front.data;	
		return value;
	}
	
	public boolean isEmpty()
	{
		return front==null;
	}
	
	public int size()
	{
		return size;
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty!!");
			return;
		}
		
		Node current=front;
		
		while(current!=null)
		{
			System.out.print(current.data+" -> ");
			current=current.next;
		}
		
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		QueueImplLinkedList queueImplLinkedList=new QueueImplLinkedList();
		queueImplLinkedList.enqueue(11);
		queueImplLinkedList.enqueue(22);
		queueImplLinkedList.enqueue(33);
		queueImplLinkedList.enqueue(44);
		queueImplLinkedList.enqueue(55);
		queueImplLinkedList.enqueue(66);
		
		
		queueImplLinkedList.display();
		
		queueImplLinkedList.dequeue();
		
		queueImplLinkedList.display();
	}

}
