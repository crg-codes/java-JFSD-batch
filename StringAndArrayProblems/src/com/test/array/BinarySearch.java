package com.test.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bufferedReader=new BufferedReader(in);
		
		System.out.println("Enter the size of the array:");
		int size=Integer.parseInt(bufferedReader.readLine());
		
		//Array declaration
		int arr[]=new int[size];
		
		//Dynamic Initialization
		for(int i=0;i<arr.length;i++) //i represents indices
		{
			System.out.println("Enter value for "+i+" position:");
			arr[i]=Integer.parseInt(bufferedReader.readLine());
		}
		
		
		System.out.println("Enter the target element:");
		int k=Integer.parseInt(bufferedReader.readLine());
		boolean flag=false;
		Arrays.sort(arr);
		
		int left=0;
		int right=arr.length-1;
		
		while(left<=right)
		{
			//int mid=(left+right)/2;  //Overflow
			
			
			int mid=left+(right-left)/2;
			if(arr[mid]==k)
			{
				flag=true;
				System.out.println("Element found at "+mid+" position.");
				break;
			}
			
			else if(k>arr[mid])
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
				
		}
		
		if(!flag)
		{
			System.out.println("Element not present!");
		}
		

	}

}


// Every iteration cuts the array size into half
//n, n/2, n/4, n/8,...  1
//O(log n)










