import java.io.FileOutputStream;
import java.io.FileInputStream;

public class Main {
  public static void main(String args[]) {
    try {
      // Create a string to write to the file
      String s = "Hello World!\n";
      byte b[] = s.getBytes();
      
      // Create a FileOutputStream to write to a file named "testout2.txt"
      FileOutputStream fout = new FileOutputStream("testout2.txt");
      
      // Write the byte array containing the string to the file
      fout.write(b);
      
      // Close the FileOutputStream
      fout.close();
      
      System.out.println("File write: Success");
    } catch (Exception e) {
      // Handle exceptions, if any
      System.out.println("Error during file write: " + e);
    }

    try {
      // Create a FileInputStream to read from the file "testout2.txt"
      FileInputStream fin = new FileInputStream("testout2.txt");
      int i = 0;

      // Read and print each character from the file until the end of file is reached
      while ((i = fin.read()) != -1) {
        System.out.print((char) i);
      }
      
      // Close the FileInputStream
      fin.close();
    } catch (Exception e) {
      // Handle exceptions, if any
      System.out.println("Error during file read: " + e);
    }
  }
}
