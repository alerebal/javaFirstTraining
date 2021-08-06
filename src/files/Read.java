package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// Define the file(path) that we want to read
		
		//String filename = "/home/alerebal/java/files/fileToRead.txt";
		String filename = "/home/alerebal/java/files/phoneNumber.txt";
		String text = null;
		
		// Create the file in Java
		File file = new File(filename);
		
		try {
			// Open the file
			BufferedReader br = new BufferedReader(new FileReader(file));
			// Read the file
			text = br.readLine();
			// Close the resources
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found: " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Could not read the file " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading the file");
		}
		
		System.out.println(text);
		}

}
