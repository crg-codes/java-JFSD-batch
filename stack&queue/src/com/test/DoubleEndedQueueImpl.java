package com.test;

import com.test.StackImplUsingLinkedList.Node;

public class DoubleEndedQueueImpl {
	
	class Node
	{
		int data;
		Node next;
		Node pre;
		
		Node(int data)
		{
			this.data=data;
		}
	}

	private Node front;
	private Node rear;
	private int size;
	
	
	public void insertFront(int value)
	{
		Node node=new Node(value);
		
		if(front==null)
		{
			front=rear=node;
		}
		
		else
		{
			node.next=front;
			front.pre=node;
			front=node;
		}
		
		size++;
	}
	
	
	public void insertRear(int value)
	{
		Node node=new Node(value);
		if(rear==null)
		{
			front=rear=node;
		}
		else
		{
			rear.next=node;
			node.pre=rear;
			rear=node;
		}
		
		size++;
	}
	
	
	public int deleteFront()
	{
		if(front==null)
		{
			System.out.println("Deque underfolw!");
			return -1;
		}
		
		int removed=front.data;
		
		if(front==rear)
		{
			front=rear=null;
		}
		else
		{
			front=front.next;
			front.pre=null;
		}
		
		size--;
		
		return removed;
		
		
	}
	
	public int deleteRear()
	{
		if(rear==null)
		{
			System.out.println("Deque underfolw!");
			return -1;
		}
		
		int removed=rear.data;
		
		if(front==rear)
		{
			front=rear=null;
		}
		else
		{
			rear=rear.pre;
			rear.next=null;
		}
		
		size--;
		
		return removed;
		
		
	}
	
	
	public void display()
	{
		Node current=front;
		
		while(current!=null)
		{
			System.out.print(current.data+" -> ");
			current=current.next;
					
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
    DoubleEndedQueueImpl dqueue=new DoubleEndedQueueImpl();
    dqueue.insertFront(11);
    dqueue.insertFront(22);
    
    dqueue.insertRear(55);
    dqueue.insertRear(66);
    
    dqueue.display();
    
    dqueue.deleteFront();
    dqueue.deleteRear();
    
    dqueue.display();



	}

}
