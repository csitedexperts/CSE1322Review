package fileIO_Operations;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class ReadingFromDateFileWithScannerEx2 {

	public static void main(String[] args) {
		try {
			File myObj = new File("./myfile.txt");
			Scanner myReader = new Scanner(myObj);
			if(myReader.hasNext()) {
				System.out.println("The file contains....");
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
			}
			else {
				System.out.println("Empty file....");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		finally {
			
			System.out.println("File operartion successful..");
		}
		
		
	}
}