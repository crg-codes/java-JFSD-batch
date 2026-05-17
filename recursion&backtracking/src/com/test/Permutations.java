package com.test;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	static void solve(int arr[],boolean used[],List<Integer> current)
	{
		//arr-[1,2,3]
		//used - tracks which elements are already included
		//used ={false,false,false}
		
		
		
		//base case
		if(current.size()==arr.length)
		{
			System.out.println(current);//[1,2,3]
			return;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(used[i])
			{
				continue;
			}
			
			//choose
			used[i]=true;
			current.add(arr[i]);
			
			
			
			//explore
			solve(arr,used,current);
			
			//undo
			used[i]=false;
			current.remove(current.size()-1);
				
			
		}
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		solve(arr,new boolean[arr.length],new ArrayList<Integer>());

	}

}


//O(n!)


/*
 * [1,2,3]
 * [false,false,false]
 * []
 * 
 * i=0
 * 
 * used[0]=false
 * [true,true,false]
 * [1,2]
 * 
 * 
 * 
 * 
 */


