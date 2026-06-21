package app.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KahnsAlgorithm {
	
	public static List<Integer> topologicalSort(int V,List<List<Integer>> graph)
	{
		int indegree[]=new int[V];
		
		
		for(int u=0;u<V;u++)
		{
			for(int v:graph.get(u))
			{
				indegree[v]++;
			}
		}
		
		
		Queue<Integer> queue=new LinkedList<Integer>();
		
		
		for(int i=0;i<V;i++)
		{
			if(indegree[i]==0)
			{
				queue.offer(i);
			}
		}
		
		List<Integer> topoOrder=new ArrayList<Integer>();
		
		while(!queue.isEmpty())
		{
			int current=queue.poll();
			
			topoOrder.add(current);
			
			for(int neighbor:graph.get(current))
			{
				indegree[neighbor]--;
				
				if(indegree[neighbor]==0)
				{
					queue.add(neighbor);
				}
			}
		}
		
		return topoOrder;
	}
	
	
	public static void main(String args[])
	{
		int V=6;
		
		List<List<Integer>> graph=new ArrayList<List<Integer>>();
		
		for(int i=0;i<V;i++)
		{
			graph.add(new ArrayList<Integer>());
		}
		//DAG
		graph.get(5).add(2);
		graph.get(5).add(0);
		graph.get(4).add(0);
		graph.get(4).add(1);
		graph.get(2).add(3);
		graph.get(3).add(1);
		
		
		List<Integer> result=topologicalSort(V, graph);
		
		System.out.println(result);
		
		
	}

}
