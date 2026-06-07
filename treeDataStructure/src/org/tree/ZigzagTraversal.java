package org.tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.tree.BFSTraversing.Node;

public class ZigzagTraversal {

	static class Node
	{
		int data;
		Node left,right;
		 
		Node(int data)
		{
			this.data=data;
			
		}
	}
	
	
	public static List<Integer> zigzag(Node root)
	{
		List<Integer> result=new ArrayList<Integer>();
		
		if(root == null)
			return result;
		
		Queue<Node> queue=new LinkedList<>();
		queue.offer(root);
		
		boolean leftToRight=true;
		
		while(!queue.isEmpty())
		{
			int size=queue.size();
			
			List<Integer> level=new ArrayList<Integer>();
			
			for(int i=0;i<size;i++)
			{
				Node current=queue.poll();
				
				level.add(current.data);
				
				if(current.left!=null)
				{
					queue.offer(current.left);
				}
				if(current.right!=null)
				{
					queue.offer(current.right);
				}
				
			}
			
			if(!leftToRight)
			{
				Collections.reverse(level);
			}
			
			result.addAll(level);
			leftToRight=!leftToRight;
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Node root=new Node(5);

		
		
		/*
		 *              5
		 *             / \
		 *           12  13
		 *           /\   \
		 *          7 14   2 
		 *          /\     /
		 *         27      23
		 * */
		root.left=new Node(12);
		root.right=new Node(13);                
		
		root.left.left=new Node(7);
		root.left.right=new Node(14);
		
		
		root.right.right=new Node(2);
		
		
		root.left.left.left=new Node(27);
		root.left.left.right=new Node(23);
		
		System.out.println(zigzag(root));

	}

}
