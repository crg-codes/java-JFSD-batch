package com.test.array;

import java.util.Scanner;

public class StringPalindromeCheck {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String st=scanner.next();
		
		String rev="";
		
		for(int i=st.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		
		System.out.println(rev);
		
		if(st.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Non Palindrome String");
		}
		
	//Palindrome check using two pointers approach	
		
		int left=0;
		int right=st.length()-1;
		
		boolean flag=true;
		
		while(left<right) //madam
		{
			if(st.charAt(left)!=st.charAt(right))
			{
				flag=false;
				break;
			}
			
			left++;
			right--;
		}
		
		if(!flag)
		{
			System.out.println("Non Palindrome!");
		}
		else
		{
			System.out.println(" Palindrome!");
		}
		


	}

}
