package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//number -> index
//complement=target-current

public class TwoSum {
	
	public static int[] twoSum(int num[],int target)
	{
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0;i<num.length;i++)
		{
			
			int complement=target-num[i];
			
			if(map.containsKey(complement))
			{
				return new int[] {map.get(complement),i};
			}
			
			map.put(num[i], i);
			
			
		}
		
		return new int[] {-1,-1};
		
	}

	public static void main(String[] args) {
		
		int nums[]= {2,7,11,15};
		
		int result[]=twoSum(nums, 19);
		
		System.out.println(Arrays.toString(result));
		

	}

}
