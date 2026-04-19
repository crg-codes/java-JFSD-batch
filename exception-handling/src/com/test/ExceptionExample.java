package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionExample {

	public static void main(String[] args) {
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int a=Integer.parseInt(bufferedReader.readLine());
		} 
		catch (NumberFormatException e) {


			e.printStackTrace();
		} 
		catch (IOException e) {


			e.printStackTrace();
		}
        
		
		int v1=12,v2=10,v3=0;
		String st=null;
		System.out.println(v1+v2);
		System.out.println(v1*v2);
		try
		{
			//unchecked exception
			System.out.println(v2/v3);
		    System.out.println(st.length());
		
		}
		/*
		 * catch(ArithmeticException e) { System.out.println(e.getMessage());
		 * System.out.println(e.fillInStackTrace()); System.out.println(e.getCause()); }
		 * catch(NullPointerException e) { System.out.println(e.getMessage());
		 * System.out.println(e.fillInStackTrace()); System.out.println(e.getCause()); }
		 */
		
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.fillInStackTrace());
			System.out.println(e.getCause());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.fillInStackTrace());
			System.out.println(e.getCause());
		}
		
		finally  //remaining code
		{
			System.out.println("End");
		}
		
	}

}
