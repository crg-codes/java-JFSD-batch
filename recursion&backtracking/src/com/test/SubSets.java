package com.test;

import java.util.ArrayList;
import java.util.List;

//Problem: Given an array [1,2,3], generate all subsets
public class SubSets {

	static void solve(int arr[],int index,List<Integer> current)
	{
		//print subsets
		
		System.out.println(current);
		
		
		for(int i=index;i<arr.length;i++)
		{
			//choose
			
			current.add(arr[i]);
			
			//Explore
			solve(arr, i+1, current);
			
			//undo
			//remove last added element so that we can try other possibility
			current.remove(current.size()-1);
		}
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		solve(arr, 0, new ArrayList<Integer>());
	}

}
