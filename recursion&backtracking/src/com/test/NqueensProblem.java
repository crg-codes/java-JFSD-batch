package com.test;

public class NqueensProblem {

	static int N=5;
	static int solutionCount;
	
	static boolean isSafe(int board[][],int row,int col)
	{
		//check upper column
		
		for(int i=0;i<row;i++)
		{
			if(board[i][col]==1)
			{
				return false;
			}
		}
		
		//check upper-left diagonal
		
		for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
		{
			if(board[i][j]==1)
			{
				return false;
			}
		}
		
		//check upper-right diagonal
		
		for(int i=row-1,j=col+1;i>=0 && j<N;i--,j++)
		{
			if(board[i][j]==1)
			{
				return false;
			}
		}
		
		return true;
		
	}
	
	static void solve (int board[][],int row)
	{
		//base case
		
		if(row==N)
		{
			solutionCount++;
			System.out.println("Solution "+solutionCount+":");
			printBoard(board);
			return;
		}
		
		//try every column
		
		for(int col=0;col<N;col++)
		{
			//check safe position
			if(isSafe(board, row, col))
			{
				//place queen
				board[row][col]=1;
				
				//explore next row	
				solve(board,row+1);
				
				//backtrack
				board[row][col]=0;
				
				
			}
		}
	}
	
	
	static void printBoard(int board[][])
	{
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(board[i][j]==1)
				{
					System.out.print("Q ");
				}
				else
				{
					System.out.print(". ");
				}
			}
			System.out.println();
		}
		System.out.println();

	}
	
	public static void main(String[] args) {
		
		
		
		int board[][]=new int[N][N];
		solve(board, 0);
		
		System.out.println("Total solutions:"+solutionCount);

	}

}
