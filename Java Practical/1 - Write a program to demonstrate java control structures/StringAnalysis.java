import java.util.Scanner;

public class StringAnalysis {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();
    scanner.close();

    int alphabetCount = 0;
    int wordCount = 0;
    int digitCount = 0;
    int specialSymbolCount = 0;
    int blankSpaceCount = 0;

    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);

      if (Character.isLetter(ch)) {
        alphabetCount++;
      } else if (Character.isDigit(ch)) {
        digitCount++;
      } else if (Character.isWhitespace(ch)) {
        blankSpaceCount++;
      } else {
        specialSymbolCount++;
      }
    }

    // Count words using split() method
    String[] words = input.split("\\s+");
    wordCount = words.length;

    System.out.println("Number of Alphabets: " + alphabetCount);
    System.out.println("Number of Words: " + wordCount);
    System.out.println("Number of Digits: " + digitCount);
    System.out.println("Number of Special Symbols: " + specialSymbolCount);
    System.out.println("Number of Blank Spaces: " + blankSpaceCount);
  }
}
