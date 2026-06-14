package com.test;

public class SortedArrayToBST {

	
	public Node sortedArrayToBST(int nums[])
	{
		return build(nums,0,nums.length-	1);
	}
	
	private Node build(int nums[],int left,int right)
	{
		if(left>right)
		{
			return null;
		}
		
		int mid=left+(right-left)/2;
		
		Node root= new Node(nums[mid]);
		
		root.left=build(nums,left,mid-1);
		root.right=build(nums,mid+1,right);
		
		return root;
		
	}
	
	public static void main(String[] args) {
		
		int array[]= {-10,-3,0,5,9};
		SortedArrayToBST arrayToBST=new SortedArrayToBST();
		
		Node root=arrayToBST.sortedArrayToBST(array);
		
		System.out.println("BST created successfully!!");
	}

}
