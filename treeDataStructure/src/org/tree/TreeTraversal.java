package org.tree;

import org.tree.TreeImplementation.Node;

public class TreeTraversal {
	
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
	
	public static void inOrder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public static void preOrder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void postOrder(Node root)
	{
		if(root == null)
		{
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
		
		
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
		
		System.out.print("Inorder:");
		inOrder(firstNode);
		
		System.out.println();
		
		System.out.print("Preorder:");
		preOrder(firstNode);
		
		System.out.println();
		
		System.out.print("Postorder:");
		postOrder(firstNode);

	}

}
