import java.util.Scanner;

public class VowelConsonantCounter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine().toLowerCase();
    scanner.close();

    int vowelCount = 0;
    int consonantCount = 0;

    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);

      // Check if the character is a letter
      if (Character.isLetter(ch)) {
        // Check if the letter is a vowel
        if (isVowel(ch)) {
          vowelCount++;
        } else {
          consonantCount++;
        }
      }
    }

    System.out.println("Number of vowels: " + vowelCount);
    System.out.println("Number of consonants: " + consonantCount);
  }

  public static boolean isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
  }
}
