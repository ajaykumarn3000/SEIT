// Import the "Main" class from the "myPackage" package
package mainPackage;
import myPackage.Main;

// Define another class named "Main2" in the "mainPackage" package
class Main2 {
    public static void main(String[] args) {
        // Create an instance of the "Main" class from the "myPackage" package
        Main m = new Main();

        // Call the "print" method of the "Main" class
        m.print();
    }
}