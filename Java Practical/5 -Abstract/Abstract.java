abstract class Bike {
    Bike() {
        System.out.println("Bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear Changed");
    }
}
class Honda extends Bike {
    void run() {
        System.out.println("Running Safely");
    }
}
class Abstract {
    public static void main(String args[]) {
        Honda bike = new Honda();
        bike.run();
        bike.changeGear();
    }
}