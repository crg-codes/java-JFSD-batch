package com.test;

public class StackImplUsingLinkedList {
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	private Node TOS;
	
	public void push(int value)
	{
		Node node=new Node(value); //[11] [22,11]
		node.next=TOS;
		TOS=node;
	}
	
	public int pop()
	{
		if(TOS==null)
		{
			return -1;
		}
		
		int value=TOS.data;   //[22,11]
		TOS=TOS.next;
		
		return value;
	}
	
	public int peek()
	{
		if(TOS==null)
		{
			return -1;
		}
		
		int value=TOS.data;   

		return value;
	}
	
	public boolean isEmpty()
	{
		return TOS==null;
	}
		
	public void display()
	{
		if(TOS==null)
		{
			System.out.println("Stack is empty!");
			return ;
		}
		
		while(TOS!=null)
		{
			System.out.print(TOS.data+" -> ");
			TOS=TOS.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		
		StackImplUsingLinkedList stack=new StackImplUsingLinkedList();
		stack.push(11);
		stack.push(22);
		stack.push(33);
		stack.push(44);
		stack.push(55);
		
		stack.display();
		
		
		

	}

}
