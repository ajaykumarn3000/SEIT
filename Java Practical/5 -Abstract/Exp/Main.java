/* i. Create an interface vehicle and classes like bicycle, car, bike etc, having common functionalities and put all
the common functionalities in the interface. Classes like Bicycle, Bike, car etc implement all these
functionalities in their own class in their own way. */
interface Vehicle {
    void speed();
    void declerate();
}
class Bicycle implements Vehicle {
    public void speed() {
        System.out.println("10 kmph");
    }
    public void declerate() {
        System.out.println("Stop");
    }
}
class Car implements Vehicle {
    public void speed() {
        System.out.println("150 kmph");
    }
    public void declerate() {
        System.out.println("Stop");
    }
}
class Motorcycle implements Vehicle {
    public void speed() {
        System.out.println("100 kmph");
    }
    public void declerate() {
        System.out.println("Stop");
    }
}
class Truck implements Vehicle {
    public void speed() {
        System.out.println("120 kmph");
    }
    public void declerate() {
        System.out.println("Stop");
    }
}

public class Main {
    public static void main(String args[]) {
        Bicycle b = new Bicycle();
        b.speed();
        b.declerate();
    }
}