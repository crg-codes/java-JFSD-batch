package com.test;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourceExample {

	public static void main(String[] args) {
		
		
		try(
			FileReader fileReader=new FileReader("test.txt");
			BufferedReader	bufferedReader=new BufferedReader(fileReader);	
			)
		{
			System.out.println("File opened");
		}
		catch (Exception e) {

			System.out.println("Error");
		}

	}

}
