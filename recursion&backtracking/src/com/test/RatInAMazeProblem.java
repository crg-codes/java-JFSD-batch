package com.test;

public class RatInAMazeProblem {
	static int N=4;
	
	static boolean isSafe(int maze[][],int row,int col)
	{
		return (row>=0 && row<N && col>=0 && col<N && maze[row][col]==1);
	}
	
	static void printSolution(int solution[][])
	{
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(solution[i][j]+" ");
			}
			
			System.out.println();
		}
	}
	
	static boolean solve(int maze[][],int row,int col,int solution[][])
	{
		//destination reached
		if(row==N-1 && col==N-1 && maze[row][col]==1)
		{
			solution[row][col]=1;
			return true;
		}
		
		if(isSafe(maze, row, col))
		{
			//Mark path
			solution[row][col]=1;
			
			//Move down
			if(solve(maze, row+1, col, solution))
				return true;
			
	
			//Move right
			if(solve(maze, row, col+1, solution))
				return true;
			
			
			//backtrack
			solution[row][col]=0;
		}
		
		return false;
	
		
		
	}
	
	
	static boolean solveMaze(int maze[][])
	{
		int solution[][]=new int[N][N];
		
		if(solve(maze,0,0,solution))
		{
			printSolution(solution);
			return true;
		}
		
		System.out.println("No Path found");
		return false;
	}

	public static void main(String[] args) {
		
		int maze[][]= {
				{1,0,0,0},
				{1,1,0,1},
				{0,1,0,0},
				{1,1,1,1}
		};
		
		
		solveMaze(maze);

	}

}
