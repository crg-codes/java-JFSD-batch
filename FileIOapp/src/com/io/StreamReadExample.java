package com.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamReadExample {

	public static void main(String[] args) throws IOException {

		Path path=Path.of("example.txt");
		
		try(Stream<String> stream=Files.lines(path);)
		{
			stream.forEach(System.out::println);
		}
	}

}
