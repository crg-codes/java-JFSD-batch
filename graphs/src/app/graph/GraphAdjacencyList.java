package app.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjacencyList {
	
	private int vertices;
	private List<List<Integer>> adjList;
	
	public GraphAdjacencyList(int vertices) {
		super();
		this.vertices=vertices;
		adjList=new ArrayList<List<Integer>>();
		
		for(int i=0;i<vertices;i++)
		{
			adjList.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int source,int destination)
	{
		adjList.get(source).add(destination);
		// for undirected graph
		adjList.get(destination).add(source);
 	}
	
	public void printGraph()
	{
		for(int i=0;i<vertices;i++)
		{
			System.out.print(i+"->");
			for(int neighbour:adjList.get(i))
			{
				System.out.print(neighbour+" ");
			}
			
			System.out.println();
		}
	}




	public static void main(String[] args) {	
	
		GraphAdjacencyList graph=new GraphAdjacencyList(5);
		//0,1,2,3,4
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		
		graph.printGraph();
	}

}
