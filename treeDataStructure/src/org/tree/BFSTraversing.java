package org.tree;

import java.util.ArrayList;

import org.tree.TreeTraversal.Node;

public class BFSTraversing {
	
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
	void levelorderRec(Node root,int level, ArrayList<ArrayList<Integer>> res)
	{
		//base case
		if(root == null	)
		{
			return;
		}
		
		if(res.size()<=level) //Add a new level to the result if needed
		{
			res.add(new ArrayList<>());
		}
		
		//add current node's data to its corresponding level
		res.get(level).add(root.data);
		
		//recur to left and right children
		levelorderRec(root.left,level+1,res);
		levelorderRec(root.right,level+1,res);
		
		
		
	}
	
	
	ArrayList<ArrayList<Integer>> levelOrder(Node root)
	{
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		levelorderRec(root, 0, res);
		
		return res;
	}
	 

	public static void main(String[] args) {
		
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
		
		
		BFSTraversing bfsTraversing=new BFSTraversing();
		
		ArrayList<ArrayList<Integer>> res=bfsTraversing.levelOrder(root);
		
		for(ArrayList<Integer> level:res)
		{
			for(int val:level)
			{
				System.out.print(val+" ");
			}
			
			System.out.println();
		}

		

	}

}
