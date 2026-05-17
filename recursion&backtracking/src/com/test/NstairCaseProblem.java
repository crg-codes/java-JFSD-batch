package com.test;

public class NstairCaseProblem {

	static int countWays(int n)
	{
		//base case
		if(n==0 ||n==1)
			return 1;
		
		//recursive calls
		return countWays(n-1)+countWays(n-2);
	}
	
	public static void main(String[] args) {
		
		int n=5;
		
		System.out.println(countWays(n));
		

	}

}

//Time complexity: O(2^n)
