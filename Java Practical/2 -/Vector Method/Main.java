import java.util.Vector;
import java.util.Scanner;

public class Main {
  public static void main(String[] args)  {
    Vector<String> vec = new Vector<String>();
    // Scanner scanner = new Scanner(System.in);
    // int choice;

    // System.out.printf("Choose a operation:\n\t1. Add()");
    // choice = scanner.nextInt();
    // switch (choice) {
    //   case 1:
        
    //     break;
    //   default:
    //     break;
    // }

    vec.add("Ajaykumar");
    for (int i = 0; i < vec.size(); i++) {
      System.out.printf("%s ", vec.get(i));
    }

    System.out.println(vec.capacity());

    

    vec.clear();
    for (int i = 0; i < vec.size(); i++) {
      System.out.printf("%s ", vec.get(i));
    }



  }
  
}
