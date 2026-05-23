package com.test;

public class BubbleSortAlgo {

	static void bubbleSort(int arr[])
	{
		int n=arr.length;
		
		
		for(int i=0;i<n-1;i++) //n outer loop for passes
		{
			boolean swapped=false;
			
			for(int j=0;j<n-1-i;j++) //n *n - Inner loop for comparison
			{
				if(arr[j]>arr[j+1]) // swap if not in correct order
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					swapped=true;
				}
			}
			
			if(!swapped) // no swap occurred, array is already sorted 
			{
				break;
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {5,1,4,2,8};
		
		System.out.println("Before sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		bubbleSort(arr);
		
		
		System.out.println();
		System.out.println("After sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}

/*
 * 
 * Time complexity: Best - O(n) Average - O(n*n) Worst: O(n*n)
 * 
 * */
