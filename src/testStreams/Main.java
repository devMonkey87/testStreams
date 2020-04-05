package testStreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		
		File file = new File(".");
		
		String absolutePath = file.getAbsolutePath();
		
		String replace = absolutePath.replace(".", "");
		BufferedReader bf = new BufferedReader(new FileReader(replace.concat("src/testStreams/test.txt")));

		
		String result = "";
		while ((result = bf.readLine()) != null) {

			System.out.println(result);
		}

	}

}
