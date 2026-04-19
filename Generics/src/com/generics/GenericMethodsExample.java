package com.generics;

class MyUtil
{
	public static <T> void print(T data)
	{
		System.out.println(data);
	}
}

public class GenericMethodsExample {

	public static void main(String[] args) {
		
		MyUtil.print("Hello");
		MyUtil.print(11);
		MyUtil.print(34.78);
	}

}
