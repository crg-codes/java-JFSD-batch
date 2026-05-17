package com.test;

import java.util.Arrays;

public class NStairCaseMemoization {

	static int dp[]=new int[100];
	
	static int countWays(int n)
	{
		//base case
		if(n==0 ||n==1)
			return 1;
		
		//already calculated
		if(dp[n]!=-1)
			return dp[n];
		
		//store and return
		dp[n]=countWays(n-1)+countWays(n-2);
		
		return dp[n];
	}
	
	
	public static void main(String[] args) {
		
		Arrays.fill(dp, -1);
		
		int n=5;
		
		System.out.println(countWays(n));
		

	}

}
