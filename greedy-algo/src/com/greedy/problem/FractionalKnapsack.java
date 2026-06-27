package com.greedy.problem;

import java.util.Arrays;

class Item
{
	int value;
	int weight;
	double ratio;
	
	public Item(int value, int weight) {
		super();
		this.value = value;
		this.weight = weight;
		this.ratio = (double)value/weight;
	}
	
	
}
public class FractionalKnapsack {

	
	public static double getMaximumValue(int capacity,Item items[])
	{
		Arrays.sort(items, (a,b)->Double.compare(b.ratio, a.ratio));
		double totalvalue=0;
		
		for(Item item:items)
		{
			if(capacity>=item.weight)
			{
				totalvalue+=item.value;
				capacity-=item.weight;
			}
			else
			{
				totalvalue+=item.ratio*capacity;
				break;
			}
			
		}
		
		return totalvalue;
	}
	public static void main(String[] args) {
		
		Item items[]= {
				new Item(60,10),
				new Item(100,20),
				new Item(120,30)
				
		};
		
		int capacity=50;
		double result=getMaximumValue(capacity, items);
		System.out.println(result);

	}

}
