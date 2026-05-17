package com.test.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ArrayOperations {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//taking input through BufferReader class
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
		
		//Array traversing
		for(int i=0;i<arr.length;i++) //i represents indices
		{
			System.out.println(arr[i]);
			
		}
		
		
		//Linear search
		System.out.println("Enter the target element:");
		int k=Integer.parseInt(bufferedReader.readLine());
		
		
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++) //i represents indices
		{
			if(arr[i]==k)
			{
				flag=true;
				System.out.println("Element present at "+i+" index.");
			}
			
		}
		
		if(!flag)
		{
			System.out.println("Element Not found!");
		}
		
		
		//Sum of the elements
		int sum=0;
		for(int i=0;i<arr.length;i++) //i represents indices
		{
			sum=sum+arr[i];
			
		}
		
		System.out.println("Sum of the elements:"+sum);
		
		//Max of all the elements
		
		int max=0,min=0;
		max=min=arr[0];
		
		for(int i=1;i<arr.length;i++) //i represents indices
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
			
		}
		
		int average=sum/(arr.length);
		
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
		System.out.println("Average:"+average);
		
		


	}

}
