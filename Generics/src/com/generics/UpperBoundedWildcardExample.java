package com.generics;

import java.util.List;

class DoubleSum
{
	public static double sum(List<? extends Number> list)
	{
		double sum=0;
		
		for(Number n:list)
		{
			sum+=n.doubleValue();
		}
		
		return sum;
	}
}
public class UpperBoundedWildcardExample {

	public static void main(String[] args) {
		
		List<Integer> numbers1=List.of(1, 2, 3, 4);
		List<Float> numbers2=List.of(1.4f, 2.6f, 3.3f, 4.9f);
		
		System.out.println(DoubleSum.sum(numbers1));
		System.out.println(DoubleSum.sum(numbers2));

	}

}
