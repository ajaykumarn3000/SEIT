package amount;

public class Convertor {
  String[] u = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
  String[] t = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
      "nineteen" };
  String[] d = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

  public void Lakh(int digit) {
    Ten(digit);
    System.out.print("lakh ");
  }

  public void Thousand(int digit) {
    Ten(digit);
    System.out.print("thousand ");
  }

  public void Hundred(int digit) {
    System.out.print(u[digit]);
    System.out.print(" hundred ");
  }

  public void Ten(int digit) {
    int tens = digit / 10;
    int units = digit % 10;
    switch (tens) {
      case 0:
        Unit(units);
        break;
      case 1:
        System.out.print(t[units]);
        System.out.print(" ");
        break;
      default:
        System.out.print(d[tens]);
        System.out.print(" ");
        Unit(units);
    }
  }

  public void Unit(int digit) {
    if (digit != 0) {
      System.out.print(u[digit]);
      System.out.print(" ");
    }
  }
}