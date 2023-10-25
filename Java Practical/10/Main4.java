import java.io.*;
public class Main4 {
  public static void main(String args[]) {
    try {
      FileInputStream fin = new FileInputStream("testout2.txt");
      BufferedInputStream bin = new BufferedInputStream(fin);
      int i = 0;
      while (i!=-1) {
        i=bin.read();
        System.out.print((char)i);
      }
      bin.close();
      fin.close();
    } catch (Exception e){
      System.out.println(e);
    }
  }
}