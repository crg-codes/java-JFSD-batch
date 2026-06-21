package app.graph;

public class GraphAdjacencyMatrix {
	
	private int vertices;
	private int matrix[][];
	

	public GraphAdjacencyMatrix(int vertices) {
		super();
		this.vertices=vertices;
		matrix=new int[vertices][vertices];
	}
	
	public void addEdge(int source,int destination)
	{
		//undirected graph
		matrix[source][destination]=1;
		matrix[destination][source]=1;

	}

	public void removeEdge(int source,int destination)
	{
		matrix[source][destination]=0;
		matrix[destination][source]=0;
	}
	
	public void printMatrix()
	{
		System.out.println("Adjacency Matrix:");
		for(int i=0;i<vertices-1;i++)
		{
			for(int j=0;j<vertices;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			
			System.out.println();
		}
	}

	

	public static void main(String[] args) {
		
		GraphAdjacencyMatrix graph=new GraphAdjacencyMatrix(4);
		//0,1,2,3
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		
		
		graph.printMatrix();



		
	}

}
/*
 * edges-e, nodes-v
 * 
 * Add/remove/search edge: O(1)
 * 
 * */














