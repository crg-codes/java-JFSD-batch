package com.test;

public class BSTValidation {
	
	private Integer pre=null;
	
	public boolean isValidBST(Node root)
	{
		if(root==null)
		{
			return true;
		}
		
		if(!isValidBST(root.left))
		{
			return false;
		}
		
		if(pre!=null && root.data<=pre)
			return false;
		
		pre=root.data;
		
		return isValidBST(root.right);
				
	}

	public static void main(String[] args) {
		
		Node root=new Node(10);
		root.left=new Node(5);
		root.right=new Node(15);
		root.right.right=new Node(3);
		/*
		 *    10
		 *    / \
		 *   5  15
		 * */
		
		BSTValidation bstValidation=new BSTValidation();
		System.out.println( bstValidation.isValidBST(root));
		

	}

}
