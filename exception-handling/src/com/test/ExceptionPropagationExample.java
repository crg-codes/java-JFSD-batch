package com.test;

public class ExceptionPropagationExample {
	
	void method3()
	{ 
		try
		{
		  System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	void method2()
	{
		method3();
	}
	
	void method1()
	{
		method2();
	}
	
	
	public static void main(String[] args) {
		
		new ExceptionPropagationExample().method1();

	}

}
