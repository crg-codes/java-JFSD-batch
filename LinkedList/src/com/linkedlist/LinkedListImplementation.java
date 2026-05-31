package com.linkedlist;



public class LinkedListImplementation {
	
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

	public static void main(String[] args) {
		
		Node n1=new Node(11);  //[11,null]
		Node n2=new Node(22);  //[22,null]
		Node n3=new Node(33);  //[33,null]
		Node n4=new Node(44);  //[44,null]
		
		Node head=n1;
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=null;
		
		//[11,ad]-->[22,ad]--->[33,ad]--->[44,null]
		
		
		//[23,null]
		//at the beginning : new.next->head,   head->new node, 
		//[23,ad]-->[11,ad]-->[22,ad]--->[33,ad]--->[44,null]
		
		//at the end: new node: [77,null] tail.next-->new
		//[23,ad]-->[11,ad]-->[22,ad]--->[33,ad]--->[44,ad]---[77,null]
		
		                          
		//at the middle of two nodes: [88,null]
		//current.next=new   new.next=current.next.next;
		//[23,ad]-->[11,ad]-->[22,ad]--->[88,ad]--->[33,ad]--->[44,ad]---[77,null]
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}

		
	}

}
