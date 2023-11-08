import java.io.FileOutputStream;

public class Main {
  public static void main(String args[]) {
    try {
      FileOutputStream fout = new FileOutputStream("testout.txt");
      fout.write(65);
      fout.close();
      System.out.println("Success");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}