package arraytestapp;

import java.util.Scanner;

public class ArrayDynamicInitiazation {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter the size of the array:");
		int size=scanner.nextInt();
		
		int intArray[]=new int[size];
		
		//size=5  [0,0,0,0,0]- default value
		
		for(int i=0;i<size;i++)
		{
			intArray[i]=scanner.nextInt();
		}
		
		
		System.out.println("Array elements:");
		for(int i=0;i<size;i++)
		{
			System.out.print(intArray[i]+" ");
		}
		
		System.out.print(intArray[6]);
	}

}
