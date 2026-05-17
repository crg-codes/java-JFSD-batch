package com.test;

//Fabonacci Series
/* 0th
 * 0 1 1 2 3 5 8 13 ...... 
 * 
 * 
 */
// finding the nth term of the series
public class Fabonacci {

	static int fibo(int n)
	{
		if(n==0)   //base condition f(0)=0
			return 0;
		if(n==1)   //base condition f(1)=1
			return 1;
		
		
		return fibo(n-1)+fibo(n-2);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(fibo(7));

	}

}


/*
 * fib(6)
 * = fib(5)+fib(4)
 * = 5  + 3fib()
 * = 8
 */
//Recursive tree
/*
 * fib(6)
 * | - fib(5)
 * |    |-fib(4)
 * |    |   |-fib(3)
 * |    |   |  |-fib(2)
 * |    |   |  |-fib(1)
 * |    |   |-fib(2)
 * |    |-fib(3)
 * |- fib(4)            
 *  // fib(4),fib(3), fib(2) calculated many times          
 */ 
//Time complexity : O(2^n)

