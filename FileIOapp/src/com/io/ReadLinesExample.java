package com.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadLinesExample {

	public static void main(String[] args) {
		
		Path path=Path.of("example.txt");
		
		List<String> lines = null;
		
		try {
			 lines=Files.readAllLines(path);
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		for(String s:lines)
		{
			System.out.println(s);
		}

	}

}
