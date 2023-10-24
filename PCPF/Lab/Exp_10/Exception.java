import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

public class Exception {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the length of array: ");
    int len = sc.nextInt();

    int[] arr = new int[len];

    System.out.println("Enter the elements: ");
    for (int i = 0; i < len; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Array: ");
    for (int i = 0; i < len; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    int choice = 1;
    int peek;
    do {
      System.out.println();
      System.out.print("Peek at index: ");
      peek = sc.nextInt();

      try {
        System.out.println("Arr[" + peek + "] = " + arr[peek]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array Index Out of Bound");
      }

      System.out.print("Enter 1 to continue: ");
      choice = sc.nextInt();
    } while (choice == 1);
  }
}
