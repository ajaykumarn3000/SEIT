import java.io.FileInputStream;

public class Main7 {
  public static void main(String args[]) {
    try {
      FileInputStream fin = new FileInputStream("files.txt");
      int i = 0;
      String[] arr = new String[10];
      String temp = "";
      int counter = 0;
      while ((i = fin.read()) != -1) {
        if ((char) i == ',') {
          arr[counter] = temp;
          temp = "";
          counter++;
        } else {
          temp = temp + (char) i;
        }
      }
      for (int j = 0; j < counter; j++) {
        if (arr[j].endsWith(".java")) {
          System.out.println(arr[j]);
        }
      }
      fin.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
