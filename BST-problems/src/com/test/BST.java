package com.test;

public class BST {
	
	Node root;
	
	
	//insert operation
	
	public Node insert(Node root,int value)
	{
		if(root == null)
		{
			return new Node(value);
		}
		
		if(value<root.data)
		{
			root.left=insert(root.left, value);
		}
		else if(value>root.data)
		{
			root.right=insert(root.right, value);
		}
		
		return root;
	}
	
	//search
	
	public Node search(Node root,int value)
	{
		if(root==null || root.data==value)
		{
		  return root;	
		}
		
		if(value<root.data)
		{
			return search(root.left, value);
		}
		
		return search(root.right, value);
	}
	
	
	//update
	
	public Node update(Node root,int oldValue,int newValue)
	{
		root=delete(root, oldValue);
		root=insert(root, newValue);
		
		return root;
	}
	
	
	//delete
	
	public Node delete(Node root,int value)
	{
		if(root == null)
		{
			return null;
		}
		
		if(value<root.data)
		{
			root.left=delete(root.left,value);
		}
		else if(value>root.data)
		{
			root.right=delete(root.right, value);
		}
		
		else
		{
			//case 1: No child
			if(root.left==null && root.right==null)
			{
				return null;
			}
			
			//case 2: One child
			if(root.left==null)
			{
				return root.right;
			}
			if(root.right==null)
			{
				return root.left;
			}
			
			//case 3: two children
			Node successor=findMin(root.right);
			
			root.data=successor.data;
			
			root.right=delete(root.right, successor.data);
			
		}
		
		return root;
		
	}
	
	//find minimum node
	private Node findMin(Node root)
	{
		while(root.left!=null)
		{
			root=root.left;
		}
		
		return root;
	}
	
	//traversing - inorder
	
	public void inOrder(Node root)
	{
		if(root == null) return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	

	
	public static void main(String args[])
	{
		BST bst=new BST();
		
		bst.root=bst.insert(bst.root, 50);
		bst.root=bst.insert(bst.root, 30);
		bst.root=bst.insert(bst.root, 70);
		bst.root=bst.insert(bst.root, 20);
		bst.root=bst.insert(bst.root, 40);
		bst.root=bst.insert(bst.root, 60);
		bst.root=bst.insert(bst.root, 80);
		
		System.out.println("Original BST:");
		bst.inOrder(bst.root);
		
		System.out.println("\nAfter update:");
		bst.root=bst.update(bst.root, 40, 45);
		bst.inOrder(bst.root);
		
		System.out.println("\n After deleting 70:");
		bst.root=bst.delete(bst.root, 70);
		bst.inOrder(bst.root);

		
		
		
		
		
		
	}

}
