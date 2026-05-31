package com.linkedlist;

import com.linkedlist.LinkedListImplementation.Node;

public class SinglyLinkedListImpl {

	//Node Node
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public Node head; //head pointer
	
	
	//insert at beginning
	public void insertAtBeginning(int data)
	{
		Node newNode=new Node(data);
		
		newNode.next=head;
		head=newNode;
	}
	
	//insert at end
		public void insertAtEnd(int data)
		{
			Node newNode=new Node(data);
			
			if(head==null)
			{
				head=newNode;
				return;
			}
			
			
			Node temp=head;
			
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			
			temp.next=newNode;
			
			
			
		}
		
		
		public void insertAtPoisition(int data,int position)
		{
			if(position<1 )
			{
				System.out.println("Invalid position");
				return;
			}
			
			if(position==1)
			{
				insertAtBeginning(data);
			}
			
			Node newNode=new Node(data);
			Node temp=head;
			
			for(int i=1;i<position-1 && temp!=null;i++)
			{
				temp=temp.next;
			}

			if(temp==null)
			{
				System.out.println("Poisition is out of range" );
				return;
			}
			
			newNode.next=temp.next;
			temp.next=newNode;
		}
		
		
		public void deleteFromBeginning()
		{
			if(head==null)
			{
				System.out.println("List is empty!");
				return;
			}
			
			head=head.next;
		}
		
		
		
		public void deleteFromEnd()
		{
			if(head==null)//if no nodes available
			{			
				return;
			}
			
			if(head.next==null)//only one node available
			{
				
				head=null;
				return;
			}
			
			Node temp=head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
				
			}
			
			temp.next=null;
		}
		
		public void deleteByValue(int value)
		{
			if(head==null)//if no node available
			{			
				return;
			}
			
			if(head.data==value)//if head matches with the value
			{			
				head=head.next;
				return;
			}
			
			Node temp=head;
			
			while(temp.next!=null && temp.next.data!=value)
			{
				temp=temp.next;
			}
			
			if(temp.next!=null)
			{
				temp.next=temp.next.next;
			}
		}
		
		
		public boolean search(int value)
		{
			Node temp=head;
			
			while(temp!=null)
			{
				if(temp.data==value)
				{
					return true;
				}
				
				temp=temp.next;
			}
			
			return false;
		}
		
		
		public void display()
		{
			Node temp=head;
			
			while(temp!=null)
			{
				System.out.print(temp.data+" -> ");
				temp=temp.next;
			}
			
			System.out.print("null");
		}
		
		
		public void reverse()
		{
			Node pre=null;
			Node current=head;
			Node next;
			
			while(current!=null)
			{
				next=current.next;
				current.next=pre;
				
				
				pre=current;
				current=pre;
				
			}
			
			head=pre;
		}
		
		
		public int findMiddle()
		{
			if(head==null)
			{
				System.out.println("Empty list");
			    return 0;
			}
			
			Node slow=head;
			Node fast=head;
			
			
			while(fast!=null && fast.next!=null)
			{
				fast=fast.next.next;
				slow=slow.next;
			}
			
			return slow.data;
			
		}
		
		
		public boolean hasCycle()
		{
			Node slow=head;
			Node fast=head;
			
			while(fast!=null && fast.next!=null)
			{
				slow=slow.next;
				fast=fast.next.next;
				
				if(slow==fast)
				{
					return true;
				}
			}
			
			return false;
		}
		
		
		public void addCycle()
		{
			Node current=head;
			
			head.next.next.next=current;
		}
	
	
	public static void main(String[] args) {

		
		SinglyLinkedListImpl list=new SinglyLinkedListImpl();
		list.insertAtBeginning(20);
		list.insertAtBeginning(10);
		
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		
		list.display();
		
		list.insertAtPoisition(25, 3);

		System.out.println();
		list.display();
		
		
		
		
		System.out.println(list.findMiddle());
		
		//list.deleteFromBeginning();
		//list.deleteFromEnd();
		//list.deleteByValue(25);
		
		//System.out.println();
		//list.display();
		
		//System.out.println();
		//System.out.println(list.search(30));
		
		list.addCycle();
		
		System.out.println(list.hasCycle());
		
	}

}


/**
 * Time complexity:
 * 
 * Insert operation:
 * beginning: O(1)
 * end: O(n)
 * specific: O(n)
 * 
 * Delete operation:
 * beginning: O(1)
 * end:O(n)
 * by value:O(n)
 * 
 * Search: O(n)
 * Traversing: O(n)
 * Reversing: O(n)
 * 
 */
