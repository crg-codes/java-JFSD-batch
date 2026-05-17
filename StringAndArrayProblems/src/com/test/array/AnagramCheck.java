package com.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String st1=scanner.next();
		String st2=scanner.next();
		
		
		char arr1[]=st1.toCharArray();
		char arr2[]=st2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Non Anagram");

		}
		

	}

}
