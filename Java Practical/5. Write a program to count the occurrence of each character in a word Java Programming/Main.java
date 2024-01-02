import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // The input word to analyze
        String word = "Java Programming";
        // Convert the word to lowercase to treat uppercase and lowercase characters the same
        word = word.toLowerCase();
        int counter; // Variable to count the occurrences of each character

        // Loop through each character in the word
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                // Skip spaces and continue to the next character
            } else {
                counter = 1; // Initialize the counter to 1 for the current character

                // Check if the character has already been counted
                for (int a = 0; a < i; a++) {
                    if (word.charAt(i) == word.charAt(a)) {
                        counter = 0; // If the character has been encountered before, set the counter to 0
                    }
                }

                // If the character is unique, count its occurrences in the rest of the word
                if (counter == 1) {
                    for (int j = i + 1; j < word.length(); j++) {
                        if (word.charAt(i) == word.charAt(j)) {
                            counter++; // Increment the counter for each occurrence of the character
                        }
                    }
                    // Print the character and its count
                    System.out.println("No. of " + word.charAt(i) + ": " + counter);
                }
            }
        }
    }
}
