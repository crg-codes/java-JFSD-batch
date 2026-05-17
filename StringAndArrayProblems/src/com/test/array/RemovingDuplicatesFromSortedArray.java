package com.test.array;

import java.util.Arrays;

public class RemovingDuplicatesFromSortedArray {

	public static void main(String[] args) 
	{
		
		//Array declaration
		int arr[]= {11,22,33,44,55,77,22,11};
		
		Arrays.sort(arr);

		int j=0;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[j])
			{
				arr[++j]=arr[i];
			}
			
		}
		
		for(int i=0;i<=j;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		
	}

}
