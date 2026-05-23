package com.test;

public class InsertionSortAlgo {

	
	static void insertionSort(int arr[])
	{
		int n=arr.length;
		
		//start from index 1 (assume 0th element is sorted)
		for(int i=1;i<n;i++)
		{
			int key=arr[i];//element to be inserted
			int j=i-1;
			
			//shift elements of sorted part greater than key
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];//shift right
				j--;
			}
			
			arr[j+1]=key;//insert key at correct position
			
		}
	}
	
	
	public static void main(String[] args) {
		

		int arr[]= {5,2,9,1,5};
		
		System.out.println("Before sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		insertionSort(arr);
		
		
		System.out.println();
		System.out.println("After sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
