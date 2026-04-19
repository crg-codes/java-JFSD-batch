package com.test;

public class ArrayIndexOutOdBoundsExample {

	public static void main(String[] args) {
		
		try
		{
			int arr[]=new int[5];
			arr[3]=50;
			try
			{
				String st="Hello";
				System.out.println(st.charAt(6));
			}
			catch (Exception e) 
			{
				System.out.println("Generic catch block");
				System.out.println(e.getMessage());		
			}

			
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Generic catch block");
			System.out.println(e.getMessage());		}

	}

}
