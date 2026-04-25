package com.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.nio.file.StandardOpenOption;






public class WriteExample {

	public static void main(String[] args) {
		
		Path path=Path.of("test.txt");
		
		try 
		{
			Files.writeString(path, "Hello, World!");

			//Files.writeString(path, "Hello, World!",StandardOpenOption.APPEND);
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		List<String> lines=List.of("Java","C","C++","Python");

		try {
			Files.write(path, lines);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
