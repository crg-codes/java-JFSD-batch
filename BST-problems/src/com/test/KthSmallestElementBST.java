package com.test;

public class KthSmallestElementBST {
	
	private int count =0;
	private int result=-1;
	
	public int kthSmallest(Node root, int k)
	{
		inOrder(root, k);
		
		return result;
	}
	
	private void inOrder(Node node,int k)
	{
		if(node == null)
			return;
		
		inOrder(node.left, k);
		
		count++;
		
		if(count==k)
		{	
			result=node.data;
			return;
		}
		
		inOrder(node.right, k);
	}

	public static void main(String[] args) {
		
		
		Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(7);

        root.left.left = new Node(2);
        root.left.right = new Node(4);

        root.right.left = new Node(6);
        root.right.right = new Node(8);
        
        KthSmallestElementBST bst=new  KthSmallestElementBST();
        int k=4;
        int result=bst.kthSmallest(root, k);
        
        System.out.println("Kth Smallest:"+result);


	}

}
