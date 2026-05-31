package com.test;

public class QuickSortAlgo {
	
	
	public static void quickSort(int arr[],int low,int high)
	{
		if(low<high)
		{
			
			//partition index
			int pivotIndex=partition(arr, low, high);
			
			//sort left subarray
			quickSort(arr, low, pivotIndex-1);
			
			//sort right subarray
			quickSort(arr, pivotIndex+1, high);
			
			
		}
	}
	
	public static int partition(int arr[],int low,int high)
	{
		//Last element as pivot
		int pivot=arr[high];
		
		
		int i=low-1;
		
		
		for(int j=low;j<high;j++)
		{
			//If the current element is smaller than the pivot
			if(arr[j]<pivot)
			{
				i++;
				//swapping arr[i] and arr[j]
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		//place pivot at correct position
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		return i+1;
	}

	public static void main(String[] args) {
		
		int arr[]= {64,25,12,22,11};
		
		
		System.out.println("Before sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.println();
		System.out.println("After sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}

/*
 * [1,2,3,4,5] pivot=5
 * 
 * [1,2,3,4] 5 []
 * */

/*
 * Time complexity: Best:O(n log n) average:O(n log n) worst: O(n*n)
 * 
 * Advantages: Efficient for large data, Fast, In-place
 * Disadvantages: Unstable, stack overhead, Worst case time complexity
 *  
 * 
 **/
