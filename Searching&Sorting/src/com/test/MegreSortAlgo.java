package com.test;

public class MegreSortAlgo {
	
	
	public static void mergeSort(int arr[],int left,int right)
	{
		//Base condition
		if(left<right)
		{
			//Find middle position
			int mid=(left+right)/2;
			
			//sort left half
			mergeSort(arr, left, mid);
			
			//sort right half
			mergeSort(arr, mid+1, right);
			
			//Merge sorted halves
			merge(arr,left,mid,right);

		}
	}

	public static void merge(int arr[],int left,int mid, int right)
	{
		int n1=mid-left+1;
		int n2=right-mid;
		
		//temporary arrays
		int leftArray[]=new int[n1];
		int rightArray[]=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			leftArray[i]=arr[left+i];
		}

		
		for(int j=0;j<n2;j++)
		{
			rightArray[j]=arr[mid+1+j];
		}
		
		
		int i=0; //index of leftArray
		int j=0; //index for rightArray
		int k=left;//index for merged array
		
		
		while(i<n1 && j<n2)
		{
			if(leftArray[i]<=rightArray[j])
			{
				arr[k]=leftArray[i];
				i++;
			}
			else
			{
				arr[k]=rightArray[j];
				j++;
			}
			
			k++;
			
		}
		
		
		while(i<n1)  //copy remaining elements from left subarray
		{
			arr[k]=leftArray[i];
			i++;
			k++;
		}
		
		
		while(j<n2) //copy remaining elements from right subarray
		{
			arr[k]=rightArray[j];
			j++;
			k++;
		}
	}
	
	public static void main(String[] args) {
		
		int arr[]= {38,27,43,3,9,82,10};
		
		System.out.println("Before sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println();
		System.out.println("After sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}

/**
 * Array is divided into log n levels
 * Each level process n elements
 * 
 * Time complexity: O(nlog n) for all cases
 * 
 * Advantages: Stable, Guaranteed O(n log n),suitable for large datasets
 * DisAdvantages: Extra memory required, Slower for small arrays
 */
