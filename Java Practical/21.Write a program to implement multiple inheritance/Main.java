// Define an interface named "Mother" with a constant "colorOfEyes"
interface Mother {
    String colorOfEyes = "black";
}

// Define an interface named "Father" with a constant "money"
interface Father {
    String money = "10000";
}

// Define a class "Son" that implements both "Mother" and "Father" interfaces
class Son implements Mother, Father {
    void print() {	
        // Access and print the constants from the interfaces
        System.out.println("Color of Eyes: " + colorOfEyes);
        System.out.println("Money: " + money);
    }
}

// Define the main class
class Main {
    public static void main(String[] args) {
        // Create an instance of the "Son" class
        Son s = new Son();

        // Call the "print" method to access and display the constants
        s.print();
    }
}
