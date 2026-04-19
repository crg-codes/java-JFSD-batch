package com.test;

import java.net.MalformedURLException;
import java.net.URL;

public class ApiCallingExample {

	public static void main(String[] args) {
		
		try
		{
			URL url=new URL("https://invalid-url"); 
			url.openStream();
			
			
		}
		
		catch (MalformedURLException e) {

			System.out.println("Invalid URL!");
		}
		catch(Exception e)
		{
			System.out.println("Network error occurred!");
		}

	}

}
