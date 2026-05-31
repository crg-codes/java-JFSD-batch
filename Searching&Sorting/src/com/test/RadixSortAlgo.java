package com.test;

public class RadixSortAlgo {

	//function to perform counting sort on specific digit
	static void countingSort(int arr[],int exp)
	{
		int n=arr.length;
		
		int output[]=new int[n];//output array
		int count[]=new int[10];//digit 0-9
		
		//count frequencies
		for(int i=0;i<n;i++)
		{
			int digit=(arr[i]/exp)%10;
			count[digit]++;
			
		}
		//prefix-sum calculation
		for(int i=1;i<10;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		
		//built output array
		for(int i=n-1;i>=0;i--)
		{
			int digit=(arr[i]/exp)%10;
			output[count[digit]-1]=arr[i];
			count[digit]--;
		}
		
		//copy output to original array
		for(int i=0;i<n;i++)
		{
			arr[i]=output[i];
		}
	}
	
	
	//Main radix sort function
	static void radixSort(int arr[])
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		//performing counting sort on every digit
		for(int exp=1;max/exp>0;exp=exp*10)
		{
			countingSort(arr, exp);
		}
	}
	
	public static void main(String[] args) {
		
     int arr[]= {64,25,12,22,11};
		
		
		System.out.println("Before sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		radixSort(arr);
		
		
		System.out.println();
		System.out.println("After sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}

/*
 * Time complexity: O(n*d)
 * 
 * */
