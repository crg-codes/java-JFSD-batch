package com.test;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

public static int[] nextGreater(int nums[])
{
	int n=nums.length;
	int result[]=new int[n];
	
	Arrays.fill(result, -1);
	
	Stack<Integer> stack=new Stack<>();
	
	for(int i=0;i<n;i++)
	{
		while(!stack.isEmpty() && nums[i]>nums[stack.peek()])
		{
			result[stack.pop()]=nums[i];
		}
		
		stack.push(i);
	}
	
	return result;
}
	
	public static void main(String[] args) {
		
		
		int arr[]= {2,1,2,4,3};
		
		int result[]=nextGreater(arr);
		
		System.out.println(Arrays.toString(result));
		
	
		

	}

}
