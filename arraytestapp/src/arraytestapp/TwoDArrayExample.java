package arraytestapp;

import java.util.Scanner;

public class TwoDArrayExample {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int rows, cols;
		rows=scanner.nextInt();
		cols=scanner.nextInt();
		
		int array[][]=new int[rows][cols];
		
		
		for(int i=0;i<rows;i++)// rows
		{
			for(int j=0;j<cols;j++)//cols
			{
				array[i][j]=scanner.nextInt();
			}
		}
		
		
		
		for(int i=0;i<rows;i++)// rows
		{
			for(int j=0;j<cols;j++)//cols
			{
				System.out.print(array[i][j]+"\t");
			}
			
			System.out.println();
		}
		
		
		int jaggedArray[][]= {
				{1,2,3},
				{4,5},
				{6}
		};
		
		for(int i=0;i<jaggedArray.length;i++)// rows
		{
			for(int j=0;j<jaggedArray[i].length;j++)//cols
			{
				System.out.print(jaggedArray[i][j]+"\t");
			}
			
			System.out.println();
		}
		
		
	}

}
