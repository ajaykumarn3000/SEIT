import java.io.*;

public class Main4 {
  public static void main(String args[]) {
    try {
      FileInputStream fin = new FileInputStream("testout.txt");
      BufferedInputStream bin = new BufferedInputStream(fin);
      int i = 0;
      while ((i = bin.read()) != -1) {
        System.out.print((char) i);
      }
      bin.close();
      fin.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}