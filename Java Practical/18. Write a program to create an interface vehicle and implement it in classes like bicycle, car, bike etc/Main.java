// Define an interface called Vehicle with accelerate and decelerate methods
interface Vehicle {
    void accelerate();
    void decelerate();
}

// Define a class Bicycle that implements the Vehicle interface
class Bicycle implements Vehicle {
    int noOfTyres = 2;
    int noOfPassengers = 1;
    String color = "red";

    // Implement the accelerate method for the Bicycle
    public void accelerate() {
        System.out.println("The Bicycle is accelerating");
    }

    // Implement the decelerate method for the Bicycle
    public void decelerate() {
        System.out.println("The Bicycle is decelerating");
    }
}

// Define a class Car that implements the Vehicle interface
class Car implements Vehicle {
    int noOfTyres = 4;
    int noOfPassengers = 5;
    String color = "black";

    // Implement the accelerate method for the Car
    public void accelerate() {
        System.out.println("The Car is accelerating");
    }

    // Implement the decelerate method for the Car
    public void decelerate() {
        System.out.println("The Car is decelerating");
    }
}

class Main {
    public static void main(String args[]) {
        // Create an instance of Bicycle
        Bicycle b = new Bicycle();

        // Call accelerate and decelerate methods for Bicycle
        b.accelerate();
        b.decelerate();

        // Create an instance of Car
        Car c = new Car();

        // Call accelerate and decelerate methods for Car
        c.accelerate();
        c.decelerate();
    }
}
