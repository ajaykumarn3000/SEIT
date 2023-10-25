import java.io.*;

public class Main6 {
  public static void main(String args[]) {
    try {
      byte[] buf = {35, 36, 37, 38, 62, 64};
      ByteArrayInputStream byt = new ByteArrayInputStream(buf);
      int k= 0;
      while ((k = byt.read()) != -1) {
        char ch = (char) k;
        System.out.println("ASCII value  of character i: "+k+"\n Special character is: "+ch);
      }
    } catch (Exception e){
      System.out.println(e);
    }
  }
}