package com.test.array;

import java.util.Scanner;

public class CountVowelsAndConsonents {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String st=scanner.next();
		
		int v=0,c=0;
		
		st=st.toLowerCase();
		
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				v++;
			}
			else
			{
				c++;
			}
		}
		
		
		System.out.println("Vowels="+v);
		System.out.println("Consonents="+c);


	}

}
