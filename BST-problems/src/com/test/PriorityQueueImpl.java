package com.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class PriorityQueueImpl {
	
	static int parent(int i)
	{
		return (i-1)/2;
	}
	
	static int leftChild(int i)
	{
		return 2*i+1;
	}

	static int rightChild(int i)
	{
		return 2*i+2;
	}
	
	static void shiftUp(int i,ArrayList<Integer> arr)
	{
		while(i>0 && arr.get(parent(i))<arr.get(i))
		{
			Collections.swap(arr, parent(i), i);
			i=parent(i);
		}
	}
	
	
	
	static void shiftDown(int i,ArrayList<Integer> arr,int size)
	{
		
		int maxIndex=i;
		int l=leftChild(i);
	
		if(l<size && arr.get(l)>arr.get(maxIndex)) 
			maxIndex=l;
		
		int r=rightChild(i);
		
		if(r<size && arr.get(r)>arr.get(maxIndex)) 
			maxIndex=r;
		
		if(i!=maxIndex)
		{
			Collections.swap(arr,i, maxIndex);
			shiftDown(maxIndex, arr, size);
		}
	}
	
	
	static void insert(int p,ArrayList<Integer> arr)
	{
		arr.add(p);
	    shiftUp(arr.size()-1, arr);
		
	}
	
	
	static int pop(ArrayList<Integer> arr)
	{
		int size=arr.size();
		if(size==0) return -1;
		int result=arr.get(0);
		arr.set(0,arr.get(size-1));
		arr.remove(size-1);
		shiftDown(0, arr, arr.size());
		
		return result;
	}
	
	
	static int getMax(ArrayList<Integer> arr)
	{
		if(arr.isEmpty()) return -1;
		
		return arr.get(0);
	}
	
	static void printHeap(ArrayList<Integer> arr)
	{
		for(int x:arr)
		{
			System.out.print(x+" ");
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> pq=new ArrayList<Integer>();
		
		insert(45, pq);
		insert(20, pq);
		insert(14, pq);
		insert(12, pq);
		insert(31, pq);
		insert(7, pq);
		insert(11, pq);
		insert(13, pq);
		insert(7, pq);
		
		
		System.out.println("Prority Queue after insert:");
		printHeap(pq);
		
		
		System.out.println(getMax(pq));
		
		pop(pq);
		
		System.out.println("Prority Queue after pop:");
		printHeap(pq);
		
		
		
		
		
		
		
	}

}
