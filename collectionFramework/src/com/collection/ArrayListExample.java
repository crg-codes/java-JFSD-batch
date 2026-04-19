package com.collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		arrayList.add(70);
		
		for(Integer obj:arrayList)
		{
			System.out.print(obj+" ");
		}
		
		arrayList.remove(1);
		System.out.println();
		
		
		
		arrayList.set(5, 80);
		for(Integer obj:arrayList)
		{
			System.out.print(obj+" ");
		}
		
		ArrayList<Integer> copy=(ArrayList<Integer>) arrayList.clone();

		System.out.println( arrayList.contains(11));
		
		System.out.println( arrayList.get(0));
		
		System.out.println( arrayList.getFirst());
		System.out.println( arrayList.getLast());
		
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.indexOf(60));
		
		System.out.println(arrayList.size());

	}

}
