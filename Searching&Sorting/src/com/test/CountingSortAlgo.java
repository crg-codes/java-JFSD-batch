package com.test;

public class CountingSortAlgo {

	public static void countingSort(int arr[])
	{
		int n=arr.length;
		int max=arr[0];
		//step - 1 : find maximum element
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		
		//Step -2: create a count array
		
		int count[]=new int[max+1];
		
		//Step -3: store frequencies
		
		for(int i=0;i<n;i++)
		{
			count[arr[i]]++;
		}
		
		//step 4: convert to cumulative count
		for(int i=1;i<=max;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		
		//step 5: build output array
		int output[]=new int[n];
		
		for(int i=n-1;i>=0;i--)
		{
			output[count[arr[i]]-1]=arr[i];
			count[arr[i]]--;
		}
		
		//step 6: copy back to the original array
		for(int i=0;i<n;i++)
		{
			arr[i]=output[i];
		}
	}
	
	public static void main(String[] args) {
int arr[]= {64,25,12,22,11};
		
		
		System.out.println("Before sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		countingSort(arr);
		
		
		System.out.println();
		System.out.println("After sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}

/**
 * 
 * Time complexity: O(n+k)
 * 
 * Advantages: Stable, Linear time complexity, very fast(small range)
 * Disadvantage: Extra memory needed(Not in-place),Not good for large range, 
 * only works on integers
 * 
 * */
