package app.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UndirectedCycleBFS {
	
	static class Pair
	{
		int node;
		int parent;
		
		Pair(int node,int parent)
		{
			this.node=node;
			this.parent=parent;
		}
	}
	
	
	static boolean bfs(int start,
			boolean visited[],
			List<List<Integer>> graph)
	{
		Queue<Pair> queue=new LinkedList<>();
		
		queue.offer(new Pair(start,-1));
		
		visited[start]=true;
		
		while(!queue.isEmpty())
		{
			Pair current=queue.poll();
			int node=current.node;
			int parent=current.parent;
			
			for(int neighbor:graph.get(node))
			{
				if(!visited[neighbor])
				{
					visited[neighbor]=true;
					queue.offer(new Pair(neighbor, node));
				}
				else if(neighbor!=parent )
				{
					return true;
					
				}
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
				if(bfs(i, visited, graph))
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
