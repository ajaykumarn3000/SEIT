import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Create a Scanner object for user input
    Scanner sc = new Scanner(System.in);

    // Prompt the user to enter a word
    System.out.print("Enter a word: ");

    // Read the user's input as a string and store it in the 'str' variable
    String str = sc.nextLine();

    // Convert the input string to lowercase to simplify vowel checking
    str = str.toLowerCase();

    // Initialize counters for vowels and consonants
    int vowels = 0, consonants = 0;

    // Iterate through the characters of the input string
    for (int i = 0; i < str.length(); i++) {
      // Check if the current character is a vowel (a, e, i, o, or u)
      if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
        vowels++; // Increment the vowel count
      } else {
        consonants++; // Increment the consonant count for non-vowel characters
      }
    }

    // Display the counts of vowels and consonants
    System.out.println("The no. of vowels: " + vowels);
    System.out.println("The no. of consonants: " + consonants);

    // Close the Scanner to release system resources
    sc.close();
  }
}
