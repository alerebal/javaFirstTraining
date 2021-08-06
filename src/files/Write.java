package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// Define the path that we want to write
		//String filename = "/home/alerebal/java/files/fileToWrite.txt";
		String filename = "/home/alerebal/java/files/wrongNumber.txt";
		//String message = "I'm writing from Java to a file for a second time";
		String message = "9453432609";
		
		// Create the file in Java
		File file = new File(filename);
		
		try {
			// Open the file
			FileWriter fw = new FileWriter(file);
			// Write the file
			fw.write(message);
			// Close the resources
			fw.close();
		} catch (IOException e) {
			System.out.println("Error: Could not read file: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the filewriter");
		}
		

	}

}
