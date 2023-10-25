import java.io.FileOutputStream;
public class Main2 {
  public static void main(String args[]) {
    try {
      String s = "welcome to java";
      byte b[] = s.getBytes();
      FileOutputStream fout = new FileOutputStream("testout2.txt");
      fout.write(b);
      fout.close();
      System.out.println("Success");
    } catch (Exception e){
      System.out.println(e);
    }
  }
}