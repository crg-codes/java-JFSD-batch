package com.greedy.problem;

import java.util.Arrays;
import java.util.Comparator;

class Job
{
	char id;
	int deadline;
	int profit;
	
	public Job(char id, int deadline, int profit) {
		super();
		this.id = id;
		this.deadline = deadline;
		this.profit = profit;
	}
	
	
}
public class JobScheduling {
	
	
	public static void scheduleJobs(Job jobs[])
	{
		Arrays.sort(jobs, (a,b)->b.profit-a.profit);
		
		int maxDeadline=0;
		
		for(Job job:jobs)
		{
			maxDeadline=Math.max(maxDeadline, job.deadline); 
		}
		
		
		char result[]=new char[maxDeadline];
		boolean slots[]=new boolean[maxDeadline];
		
		int totalProfit=0;
		
		for(Job job:jobs)
		{
			for(int j=Math.max(maxDeadline, job.deadline)-1;j>=0;j--)
			{
				if(!slots[j])
				{
					slots[j]=true;
					result[j]=job.id;
					totalProfit=totalProfit+job.profit;
					
					break;
				}
			}
		}
		
		System.out.println("Scheduled jobs:");
		for(int i=0;i<maxDeadline;i++)
		{
			if(slots[i])
				System.out.print(result[i]+" ");
		}
		
		
		System.out.println("\n Total profit="+totalProfit);
		
	}

	public static void main(String[] args) {

		Job jobs[]= {
				new Job('A',2,100),
				new Job('B',1,19),
				new Job('C',2,27),
				new Job('D',1,25),
				new Job('E',3,15)	
		};
		
		
		scheduleJobs(jobs);
		

	}

}
