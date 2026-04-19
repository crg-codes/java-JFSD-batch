package com.test;

import java.util.function.BiFunction;

public class MethodRefrenceDemo {
	
	public static int addition(int a,int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		
	BiFunction<Integer, Integer, Integer> functionLambda=
			(a,b)->MethodRefrenceDemo.addition(10,20);
			
	BiFunction<Integer, Integer, Integer> function=
			MethodRefrenceDemo::addition;
	
	//ContainingClass :: staticMethodName; 
	
	System.out.println(function.apply(10, 20));

	}

}
