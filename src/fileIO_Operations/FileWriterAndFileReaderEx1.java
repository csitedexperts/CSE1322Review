package fileIO_Operations;
/* J15_07.java   */
/* Writing into and Reading from a same Data File  */
import java.io.*;

public class FileWriterAndFileReaderEx1{  
	public static void main(String[] args) throws IOException  {  
		
		FileWriter fws = new FileWriter("./myfile.txt");
		
		System.out.println("The file named myfile.txt is opened: ");
		System.out.println("Write data and Press A to display:");
	
		char c = (char)System.in.read();  // Reading  a Character

		while(c != 65)   // While not pressed A
		{
			fws.write(c);  // Writting into file
			c = (char)System.in.read();// Reading  a Character
		}
		fws.close();	// closing data file

		// Reopening for deading         
		FileReader frs = new FileReader("./myfile.txt");
		System.out.println("The File myfile.txt Contains: ");
		BufferedReader br = new BufferedReader(frs);
		String S; 
		while(( S = br.readLine()) !=null) 
			// reading from data file
		{ 
			System.out.print(S);  // display into monitor
		} 
		frs.close();  // closing data file
	}
}
