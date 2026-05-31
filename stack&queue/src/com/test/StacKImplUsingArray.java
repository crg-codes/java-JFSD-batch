package com.test;


class StackArray
{
	private int arr[];
	private int TOP; //top of stack
	private int capacity;
	
	public StackArray(int size)
	{
		arr=new int[size];
		capacity=size;
		TOP=-1; //empty stack
	}
	
	
	public void push(int value)
	{
		if(TOP==capacity-1)
		{
			System.out.println("Stack Overflow!");
			return;
		}
		
		arr[++TOP]=value;
	}
	
	public int pop()
	{
		if(TOP==-1)
		{
			System.out.println("Stack Underflow!");
			return -1;
		}
		
		return arr[TOP--];
	}
	
	public int peek()
	{
		if(TOP==-1)
		{
			System.out.println("Stack is empty!");
			return -1;
		}
		
		return arr[TOP];
	}
	
	public boolean isEmpty()
	{
		return TOP==-1;
	}
	
	
	public void display()
	{
		for(int i=TOP;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

public class StacKImplUsingArray {

	public static void main(String[] args) {
		
		StackArray stackArray=new StackArray(5);
		
		stackArray.push(11);
		stackArray.push(22);
		stackArray.push(33);
		stackArray.push(44);
		stackArray.push(55);
		
		stackArray.display();
		stackArray.push(11);
		
		stackArray.pop();
		stackArray.pop();
		
		stackArray.display();
		
		System.out.println(stackArray.peek());
		System.out.println(stackArray.isEmpty());
	}

}
