package com.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFileExample {

	public static void main(String[] args) throws IOException {
		
		Path path=Path.of("example.txt");
		
		String content=Files.readString(path);
		
		System.out.println(content);
		
		

	}

}
