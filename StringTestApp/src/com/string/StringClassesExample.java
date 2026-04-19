package com.string;

public class StringClassesExample {

	public static void main(String[] args) {
		
		
		StringBuilder builder=new StringBuilder("Welcome to Java!");
		
		System.out.println(builder.capacity());
		System.out.println(builder.length());
		System.out.println(builder.reverse());
		System.out.println(builder.charAt(0));
		System.out.println(builder.append("!! "));
		System.out.println(builder.insert(0, "abc"));
		
		
		StringBuffer buffer=new StringBuffer("We are programmers!");
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		System.out.println(buffer.reverse());
		System.out.println(buffer.charAt(0));
		System.out.println(buffer.append("!! "));
		System.out.println(buffer.insert(0, "abc"));
		
	}

}
