// package amount;

import java.util.Scanner;
import java.lang.Math;

class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    String numberString = sc.next();
    int len = numberString.length();
    int numArr[] = new int[len];

    int divider = (int) Math.pow(10, len - 1);

    for (int i = 0; i < len; i++) {
      numArr[i] = numberString.charAt(i) - '0';
    }
    // for (int j = 0; j < len; j++) {
    // System.out.print(numArr[j] + " ");
    // }

    String[] u = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    String[] t = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
        "nineteen" };
    String[] d = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

  }

  void Hundred() {
    for (int k = 0; k < len; k++) {
      if (k == 0) {
        System.out.print(u[numArr[k]]);
        System.out.print(" hundred ");
      }
      if (k == 1 && numArr[k] == 1) {
        System.out.print(t[numArr[k]]);
      } else if (k == 1) {
        System.out.print(d[numArr[k]]);
      }
      if (k == 2) {
        System.out.print(" ");
        System.out.print(u[numArr[k]]);
      }
    }
  }
}