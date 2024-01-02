import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the length of the array
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        System.out.println("Enter array data");

        // Read input data for the array
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: ");

        // Display the original array
        for (int j = 0; j < len; j++) {
            System.out.print(arr[j] + " ");
        }

        int temp;

        // Reverse the array by swapping elements from the beginning and end
        for (int k = 0; k <= (len / 2) - 1; k++) {
            temp = arr[k];
            arr[k] = arr[len - 1 - k];
            arr[len - 1 - k] = temp;
        }

        System.out.println("\nReversed Array: ");

        // Display the reversed array
        for (int l = 0; l < len; l++) {
            System.out.print(arr[l] + " ");
        }

        sc.close(); // Close the scanner to release resources
    }
}
