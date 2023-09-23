// i. Write a program to demonstrate checked Exception Handling using nested try, multiple catch statements. 

public class Main {
  public static void main(String[] args) {
    System.out.println("");
    try {

      try {
        int[] num = { 1, 2, 3 };
        int b = num[4];
      } catch (Exception e) {
        System.out.println(e);
      } finally {
        System.out.println("The inner try block executed");
      }
      
      System.out.println("Dividing 10/0");
      int a = 10 / 0;
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("The outer try block executed");
    }
    System.out.println("");
  }
}
