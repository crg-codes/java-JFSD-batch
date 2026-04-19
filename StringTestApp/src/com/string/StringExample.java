package com.string;

public class StringExample {

	public static void main(String[] args) {
		
		String st="Welcome to Java!!"; //stored in constant pool
		String st1=new String("Welcome to Java!!");	//heap  memory	
		String st2="   ";
		
		System.out.println(st==st1);
		System.out.println(st.equals(st1));
		
		
		for(int i=0;i<st.length();i++)
		{
			System.out.print(st.charAt(i));
		}
		System.out.println();
		
		for(int i=st.length()-1;i>=0;i--)
		{
			System.out.print(st.charAt(i));
		}
		
		
		System.out.println(st1.toUpperCase());
		System.out.println(st1.toLowerCase());
		
		
		System.out.println(st.indexOf('J'));
		System.out.println(st.indexOf('J',0,5));
		System.out.println(st.equalsIgnoreCase(st1));
		
		System.out.println(st.replace('J', 'j'));
		
		
		System.out.println(st.concat("!"));
		System.out.println(st.isEmpty());//length is 0 return true else false
		System.out.println(st.isBlank());//check blank or non-blank 
		
		
		System.out.println(st2.isEmpty());//length is 0 return true else false
		System.out.println(st2.isBlank());//check blank or non-blank 
		
		
		System.out.println(st.contains("Java"));
		System.out.println(st.substring(11));
		System.out.println(st.substring(11,15));
		
		
		String array[]=st.split(" ");
		
		System.out.println(array.length);
		
		int value=30;
		
		String s3=String.valueOf(value);
		System.out.println(s3);
		
		
		
	}

}
