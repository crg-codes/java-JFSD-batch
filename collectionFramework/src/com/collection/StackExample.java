package com.collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		

		Stack<Integer> stack=new Stack<Integer>();
		
		stack.add(11);
		stack.add(22);
		stack.add(33);
		stack.add(44);
		stack.add(55);
		
		for(int i=0;i<stack.size();i++)
		{
			System.out.print(stack.get(i)+" ");
		}
		
		
		stack.push(66);
		System.out.println(stack.pop());
		
		System.out.println(stack.peek());
		
		System.out.println(stack.search(33));
	}

}
