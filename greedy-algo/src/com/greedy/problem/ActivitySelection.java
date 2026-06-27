package com.greedy.problem;

import java.util.Arrays;
import java.util.Comparator;

class Activity
{
	int start;
	int finish;
	
	public Activity(int start,int finish) {
		
		this.start=start;
		this.finish=finish;
	}
}

public class ActivitySelection {
	
	
	public static void activitySelection(Activity activities[] )
	{
		Arrays.sort(activities,Comparator.comparingInt(a->a.finish));//O(n log n)
		
		System.out.println("Selected activities:");
		
		int lastFinish=activities[0].finish;
		
		System.out.print("("+activities[0].start+","+activities[0].finish+")");
		
		for(int i=1;i<activities.length;i++	)//O(n)
		{
			if(activities[i].start>=lastFinish)
			{
				System.out.print("("+activities[i].start+","+activities[i].finish+")");	
			    lastFinish=activities[i].finish;	
			}
		}
	}

	public static void main(String[] args) {
		
		Activity activities[]= {
			new Activity(1, 4),
			new Activity(3, 5),
			new Activity(0, 6),
			new Activity(5, 7),
			new Activity(8, 9),
			new Activity(5, 9)
		};
		
		activitySelection(activities);
		

	}

}




/*
 * Time complexity: O(n log n)
 * Space complexity:O(1)
 * */
