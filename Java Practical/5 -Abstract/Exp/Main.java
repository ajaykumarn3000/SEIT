/* i. Create an interface vehicle and classes like bicycle, car, bike etc, having common functionalities and put all
the common functionalities in the interface. Classes like Bicycle, Bike, car etc implement all these
functionalities in their own class in their own way. */

interface Vehicle {
    void speed();
    void declerate();
}
class Bicycle implements Vehicle {
    public void speed() {
        System.out.println("Bicycle at 10 kmph");
    }
    public void declerate() {
        System.out.println("Bicycle Stoped");
    }
}
class Car implements Vehicle {
    public void speed() {
        System.out.println("Car at 150 kmph");
    }
    public void declerate() {
        System.out.println("Car Stoped");
    }
}
class Motorcycle implements Vehicle {
    public void speed() {
        System.out.println("MotorCycle at 100 kmph");
    }
    public void declerate() {
        System.out.println("MotorCycle Stoped");
    }
}
class Truck implements Vehicle {
    public void speed() {
        System.out.println("Truck at 120 kmph");
    }
    public void declerate() {
        System.out.println("Truck Stoped");
    }
}

public class Main {
    public static void main(String args[]) {
        Bicycle b = new Bicycle();
        b.speed();
        b.declerate();

        Car c = new Car();
        c.speed();
        c.declerate();
    }
}