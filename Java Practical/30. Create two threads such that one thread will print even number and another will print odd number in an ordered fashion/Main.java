import java.lang.Thread;

// A Counter class to manage counting and printing even or odd numbers
class Counter {
    // Synchronized method to ensure thread safety
    synchronized void count(String type) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0 && type.equals("even")) {
                System.out.println("Even: " + i);
            }
            if (i % 2 == 1 && type.equals("odd")) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

// Define a thread class to print odd numbers
class Odd extends Thread {
    Counter c;

    Odd(Counter c) {
        this.c = c;
    }

    public void run() {
        c.count("odd");
    }
}

// Define a thread class to print even numbers
class Even extends Thread {
    Counter c;

    Even(Counter c) {
        this.c = c;
    }

    public void run() {
        c.count("even");
    }
}

// Main class
class Main {
    public static void main(String args[]) {
        Counter c1 = new Counter();
        Odd o = new Odd(c1);
        Even e = new Even(c1);

        o.start(); // Start the Odd thread
        e.start(); // Start the Even thread
    }
}
