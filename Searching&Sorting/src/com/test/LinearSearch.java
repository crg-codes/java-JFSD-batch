package com.test;

public class LinearSearch {

	public static int linearSearch(int arr[],int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(target==arr[i])
			{
				return i;
			}
		}
		
		return -1;
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {10,45,67,34,7,89,34};
		
		int result=linearSearch(arr, 66);
		
		if(result!=-1)
		{
			System.out.println("Element found at index :"+result);
		}
		else
		{
			System.out.println("Element not found!");
		}

	}

}

/**
 * Best : O(1)  Average: O(n)  Worst: O(n)
 * 
 * Advantages: 
 * i)Simple to implement
 * ii)Works on unsorted array
 * iii)NO preprocessing is needed
 * 
 * Disadvantages:
 * i)Slow for larger data sets.
 * ii)Checks element one by one.
 */



















