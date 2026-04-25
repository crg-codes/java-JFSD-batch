package com.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OtherFileOperations {

	public static void main(String[] args) {

		Path path1 = Path.of("test.txt");
		Path path2 = Path.of("test1.txt");

		try {

			Files.copy(path1, path2);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		try {
			Files.move(Path.of("test.txt"), Path.of("sample.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
