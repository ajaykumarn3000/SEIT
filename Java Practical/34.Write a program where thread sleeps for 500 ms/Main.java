import java.lang.Thread;

// Define a class A
class A {
    // Constructor for class A
    A() {
        // Loop from 0 to 9
        for (int i = 0; i < 10; i++) {
            System.out.println(i); // Print the current value of i
            try {
                Thread.sleep(500); // Pause execution for 500 milliseconds (0.5 seconds)
            } catch (Exception e) {
                System.out.println(e); // Handle any exceptions that may occur during sleep
            }
        }
    }
}

// Define the main class
class Main {
    public static void main(String args[]) {
        A a = new A(); // Create an instance of class A
    }
}
