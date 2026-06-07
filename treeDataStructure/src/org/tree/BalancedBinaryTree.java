package org.tree;

import org.tree.ZigzagTraversal.Node;

public class BalancedBinaryTree {

	static class Node
	{
		int data;
		Node left,right;
		 
		Node(int data)
		{
			this.data=data;
			
		}
	}
	
	private static int checkHeight(Node node)
	{
		if(node == null)
			return 0;
		
		int left=checkHeight(node.left);
		
		if(left==-1)
			return -1;
		
		int right=checkHeight(node.right);
		
		if(right==-1)
			return -1;
		
		if(Math.abs(left-right)>1)
			return -1;
		
		
		return Math.max(left, right)+1;
	}
	
	
	public static boolean isBalanced(Node root)
	{
		return checkHeight(root)!=-1;
	}
	public static void main(String[] args) {
		/*
		 *              5
		 *             / \
		 *           12  13
		 *           /\   \
		 *          7 14   2 
		 *          /\     /
		 *         27      23
		 * */
		Node root=new Node(5);
		root.left=new Node(12);
		root.right=new Node(13);                
		
		root.left.left=new Node(7);
		root.left.right=new Node(14);
		
		
		//root.right.right=new Node(2);
		
		
		root.left.left.left=new Node(27);
		//root.left.left.right=new Node(23);
		
		System.out.println(isBalanced(root));

	}

}
