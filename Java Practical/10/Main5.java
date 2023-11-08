import java.io.*;

public class Main5 {
  public static void main(String args[]) {
    try {
      FileOutputStream fout1 = new FileOutputStream("testout.txt");
      BufferedOutputStream bout = new BufferedOutputStream(fout1);
      String s = "I'm Ajaykumar\n";
      byte b[] = s.getBytes();
      bout.write(b);
      bout.close();
      fout1.close();
      System.out.println("Success");
    } catch (Exception e){
      System.out.println(e);
    }
  }
}