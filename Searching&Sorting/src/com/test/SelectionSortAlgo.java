package com.test;

public class SelectionSortAlgo {

	static void selectionSort(int arr[])
	{
		
		int n=arr.length;
		
		//Move boundary of unsorted part
		for(int i=0;i<n-1;i++)
		{
			//Assume current index as minimum
			int minIndex=i;
			
			//Find minimum in the remaining array
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
			}
			
			//swap minimum with first unsorted element
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void main(String[] args) {
		
		
		int arr[]= {64,25,12,22,11};
		
		
		System.out.println("Before sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		selectionSort(arr);
		
		
		System.out.println();
		System.out.println("After sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}

/*
 * Time complexity:
 * Best: O(n*n) Average:O(n*n) Worst: O(n*n)
 * */
