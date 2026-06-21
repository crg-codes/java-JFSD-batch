package app.graph;

import java.util.ArrayList;
import java.util.List;

public class UndirectedCycleDFS {
	
	public static boolean dfs(int node,
			int parent,
			boolean visited[],
			List<List<Integer>> graph)
	{
		visited[node]=true;
		
		for(int neighbor:graph.get(node))
		{
			if(!visited[neighbor])
			{
				if(dfs(neighbor,node,visited,graph))
				{
					return true;
				}
			}
			
			else if(neighbor!=parent)
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	static boolean hasCycle(int v,List<List<Integer>> graph)
	{
		boolean visited[]=new boolean[v];
		
		for(int i=0;i<v;i++)
		{
			if(!visited[i])
			{
				if(dfs(i, -1, visited, graph))
				{
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		int v=4;
		List<List<Integer>> graph=new ArrayList<List<Integer>>();
		
		for(int i=0;i<v;i++)
		{
			graph.add(new ArrayList<Integer>());
		}
		
		graph.get(0).add(1);
		graph.get(1).add(0);
		
		
		graph.get(1).add(2);
		graph.get(2).add(1);
		
		graph.get(2).add(3);
		graph.get(3).add(2);
		
		graph.get(3).add(0);
		graph.get(0).add(3);
		
		System.out.println(hasCycle(v, graph));
	}

}
