import java.io.FileInputStream;
public class Main3 {
  public static void main(String args[]) {
    try {
      FileInputStream fin = new FileInputStream("testout2.txt");
      int i = 0;
      while (i!=-1) {
        i=fin.read();
        System.out.print((char)i);
      }
      fin.close();
    } catch (Exception e){
      System.out.println(e);
    }
  }
}