// Define a class "Five" that implements the Runnable interface
class Five implements Runnable {
    public void run() {
        // Loop to print the multiplication table of 5
        for (int i = 1, j = 5; i <= 10; i++, j += 5) {
            System.out.println("5 x " + i + " = " + j);
        }
    }
}

// Define a class "Seven" that implements the Runnable interface
class Seven implements Runnable {
    public void run() {
        // Loop to print the multiplication table of 7
        for (int i = 1, j = 7; i <= 10; i++, j += 7) {
            System.out.println("7 x " + i + " = " + j);
        }
    }
}

// Define a class "Thirteen" that implements the Runnable interface
class Thirteen implements Runnable {
    public void run() {
        // Loop to print the multiplication table of 13
        for (int i = 1, j = 13; i <= 10; i++, j += 13) {
            System.out.println("13 x " + i + " = " + j);
        }
    }
}

// Define the main class
class Main {
    public static void main(String args[]) {
        // Create instances of the "Five," "Seven," and "Thirteen" classes
        Five five = new Five();
        Seven seven = new Seven();
        Thirteen thirteen = new Thirteen();

        // Create threads for each multiplication table
        Thread t1 = new Thread(five);
        Thread t2 = new Thread(seven);
        Thread t3 = new Thread(thirteen);

        // Start the threads using the run method (should use start instead)
        t1.run();
        t2.run();
        t3.run();
    }
}
