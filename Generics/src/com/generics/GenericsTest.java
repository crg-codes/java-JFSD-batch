package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>(); 
		
		list.add("Hello");
		list.add("11");
		
		
		String s=list.get(1);
		System.out.println(s);
		
		List<Integer> integers=new ArrayList<Integer>();
		List<Double> doubles=new ArrayList<Double>();
		
		
		

	}

}
