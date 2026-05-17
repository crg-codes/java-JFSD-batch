package com.test;

import java.util.Arrays;

public class FibonacciMemoization {

	
	static int[] dp=new int[100];
	
	static int fibo(int n)
	{
		if(n<=1)
			return n;
		if(dp[n]!=-1)
			return dp[n];
		
		dp[n]=fibo(n-1)+fibo(n-2);
		
		return dp[n];
	}
	public static void main(String[] args) {
		
		Arrays.fill(dp, -1);
		
		int n=6;//nth term of the series
		System.out.println(fibo(n));

	}

}


/*
 * dp=[-1,-1,-1,-1........]
 * 
 * dp=[-1,-1,1,2,3,5,8]
 * fib(4),fib(3), fib(2) calculated only once.   
 */

//Time complexity: O(n)
