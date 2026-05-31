package com.linkedlist;

import com.linkedlist.SinglyLinkedListImpl.Node;

public class DoublyLinkedListImpl {
	
	//Node Node
		static class Node
		{
			int data;
			Node pre;
			Node next;
			
			Node(int data)
			{
				this.data=data;
				this.next=null;
				this.pre=null;
			}
		}
		
		private Node head;
		private Node tail;
		
		
		public void insertAtTheBeginning(int data)
		{
			Node newNode=new Node(data);
			
			if(head==null)
			{
				head=tail=newNode;
			}
			
			newNode.next=head;
			head.next=newNode;
			head=newNode;
		}
		
		public void insertAtTheEnd(int data)
		{
			Node newNode=new Node(data);
			
			if(head==null)
			{
				head=tail=newNode;
				return;
			}
			
			tail.next=newNode;
			newNode.pre=tail;
			tail=newNode;
		}
		
		
		public void deleteFromBeginning()
		{
			if(head==null)
				return;
			if(head==tail)
			{
				head=tail=null;
				return;
			}
			
		head=head.next;
		head.pre=null;
			
		}
		
		public void deleteFromEnd()
		{
			if(head==null)
				return;
			if(head==tail)
			{
				head=tail=null;
				return;
			}
			
			tail=tail.pre;
			tail.next=null; 
			
		}
		
		
		public void displayForward()
		{
			Node tmp=head;
			while(tmp!=null)
			{
				System.out.print(tmp.data+"->");
				tmp=tmp.next;
			}
			System.out.println();
		}
		
		public void reverse()
		{
			Node current=head;
			Node pre=null;
			
			tail=head;
			
			while(current!=null)
			{
				Node next=current.next;
				
				current.next=pre;
				current.pre=next;
				
				pre=current;
				current=next;
				
				
			}
			
			head=pre;
			
			
		}
		
		
	public static void main(String[] args) {
		

		DoublyLinkedListImpl list=new DoublyLinkedListImpl();
		
		list.insertAtTheBeginning(20);
		list.insertAtTheBeginning(10);
		
		
		list.insertAtTheEnd(30);
		list.insertAtTheEnd(40);
		
		list.displayForward();
		
		//list.deleteFromBeginning();
		//list.deleteFromEnd();
		
		//list.displayForward();
		
	   list.reverse();
	  
	   list.displayForward();
	}

}
