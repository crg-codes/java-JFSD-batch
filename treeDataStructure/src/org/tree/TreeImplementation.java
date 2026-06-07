package org.tree;

public class TreeImplementation {
	static class Node
	{
		int data;
		Node left,right;
		
		Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
	
	

	public static void main(String[] args) {
		
		Node firstNode=new Node(12);
		Node secondNode=new Node(89);
		Node thirdtNode=new Node(45);
		Node fourthtNode=new Node(43);
		Node fifthtNode=new Node(34);
		Node sixthNode=new Node(67);
		
		firstNode.left=secondNode;
		firstNode.right=thirdtNode;
		
		secondNode.left=fourthtNode;
		secondNode.right=fifthtNode;
		
		thirdtNode.right=sixthNode;
		
				


	}

}
