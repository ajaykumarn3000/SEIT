import java.util.Scanner;
import java.lang.Math;
import amount.Convertor;

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

    Convertor conv = new Convertor();
    boolean skip = false;

    for (int k = len; k > 0; k--) {
      switch (k) {
        case 7:
          conv.Lakh(((numArr[len - k] * 10) + numArr[len - k + 1]));
          skip = true;
          break;
        case 6:
          if (!skip) {
            conv.Lakh(numArr[len - k]);
          } else {
            skip = false;
          }
          break;
        case 5:
          conv.Thousand(((numArr[len - k] * 10) + numArr[len - k + 1]));
          skip = true;
          break;
        case 4:
          if (!skip) {
            conv.Thousand(numArr[len - k]);
          } else {
            skip = false;
          }
          break;
        case 3:
          conv.Hundred(numArr[len - k]);
          break;
        case 2:
          conv.Ten(((numArr[len - k] * 10) + numArr[len - k + 1]));
          skip = true;
          break;
        case 1:
          if (!skip) {
            conv.Unit(numArr[len - k]);
          } else {
            skip = false;
          }
          break;
        default:
          break;
      }
    }
  }
}