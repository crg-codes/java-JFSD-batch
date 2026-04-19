package com.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeywordExample {
	
	static BufferedReader bufferedReader=null;
	static void readFile() throws IOException,FileNotFoundException
	{
		FileReader fileReader=new FileReader("test.txt");
		bufferedReader=new BufferedReader(fileReader);
		System.out.println(bufferedReader.readLine());
	}

	public static void main(String[] args) {
	
		try
		{
			readFile();
		}
		catch (IOException e) {
			System.out.println("Exception Handled "+e.getMessage());
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Handled "+e.getMessage());
			
		}
		finally
		{
			try {
				bufferedReader.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}
