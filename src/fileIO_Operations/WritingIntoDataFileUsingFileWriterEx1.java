package fileIO_Operations;
/* J15_01.java   */
/* Opening a New Data File  */
import java.io.*; // Required for FileWriter Class
public class WritingIntoDataFileUsingFileWriterEx1{  
	
 public static void main(String[] args) throws IOException 
   {  
   FileWriter fr = new FileWriter("Mokter.doc");
   
   PrintWriter pr = new PrintWriter(fr);
   System.out.println("Test.....");
   fr.close();
  }
}
