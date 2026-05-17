package com.test.array;

import java.util.Scanner;

public class LongestWordInASentence {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String st1=scanner.nextLine();
		
		String array[]=st1.split(" ");
		
		String longest="";
		
		for(String word:array)
		{
			if(word.length()>longest.length())
			{
				longest=word;
			}
		}
		
		System.out.println(longest);

	}

}
