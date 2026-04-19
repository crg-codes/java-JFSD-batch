package com.test;


public class ThrowExample {

	public static void main(String[] args) {
		
		try
		{
			int age=15;
			if(age<18)
			{
				throw new InvalidAgeException("Not eligible");
			}
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
