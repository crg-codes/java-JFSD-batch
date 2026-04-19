package com.generics;

import java.util.ArrayList;
import java.util.List;

class TestNumbers
{
	public static void addNumbers(List<? super Integer> list)
	{
		list.add(10);
		list.add(20);

	}
}

public class LowerBoundedWildcardExample {

	public static void main(String[] args) {
	
		List<Number> list1=new ArrayList<Number>();
		List<Object> list2=new ArrayList<Object>();
		
		
		TestNumbers.addNumbers(list1);
		TestNumbers.addNumbers(list2);


	}

}
