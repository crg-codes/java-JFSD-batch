package com.test;

public class QueueImpleArray {

	private int arr[];
	private int front;
	private int rear;
	private int capacity;
	
	public QueueImpleArray(int size)
	{
		arr=new int[size];
		capacity=size;
		
		front=0;
		rear=-1;
	}
	
	public void enqueue(int value)
	{
		if(rear==capacity-1)
		{
			System.out.println("Queue is full!!");
			return;
		}
		
		arr[++rear]=value;
	}
	
	
	public int dequeue()
	{
		if(isEmpty())
		{
			return -1;
		}
		
		return arr[front++];
	}
	
	public boolean isEmpty()
	{
		return front>rear;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			return -1;
		}
		
		return arr[front];
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty!!");
			return;
		}
		
		for(int i=front;i<rear;i++)
		{
			System.out.print(arr[i]+" -> ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		

		QueueImpleArray queue=new QueueImpleArray(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		queue.display();
		
		queue.dequeue();
		
		queue.display();
	}

}
