package app.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphTraversalBFS {
	
	public static void bfs(int start,List<List<Integer>> graph)
	{
		boolean visited[]=new boolean[graph.size()];
		
		Queue<Integer> queue=new LinkedList<Integer>();
		
		visited[start]=true;
		
		queue.offer(start);
		
		while(!queue.isEmpty())
		{
			int node=queue.poll();
			System.out.print(node+" -> ");
			
			for(int neighbor:graph.get(node))
			{
				if(!visited[neighbor])
				{
					visited[neighbor]=true;
					queue.offer(neighbor);
				}
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int V=5;
		List<List<Integer>> graph=new ArrayList<>();
		
		for(int i=0;i<V;i++)
		{
			graph.add(new ArrayList<Integer>());
		}
		
		graph.get(0).add(1);
		graph.get(0).add(2);
		
		
		graph.get(1).add(0);
		graph.get(1).add(2);
		graph.get(1).add(3);
		
		
		graph.get(2).add(0);
		graph.get(2).add(1);
		graph.get(2).add(4);
		
		graph.get(3).add(1);
		graph.get(3).add(4);
		
		
		graph.get(4).add(2);
		graph.get(4).add(3);
		
		bfs(0, graph);
	}

}
