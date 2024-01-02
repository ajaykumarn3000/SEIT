// Define an abstract class called Shape
abstract class Shape {
    // Declare an abstract method called draw (to be implemented by subclasses)
    abstract void draw();
}

// Define a subclass Rectangle that extends the Shape class
class Rectangle extends Shape {
    // Implement the draw method for Rectangle
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Define a subclass Circle that extends the Shape class
class Circle extends Shape {
    // Implement the draw method for Circle
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Main {
    public static void main(String[] args) {
        // Create an instance of Rectangle
        Rectangle r = new Rectangle();

        // Call the draw method for Rectangle
        r.draw();

        // Create an instance of Circle
        Circle c = new Circle();

        // Call the draw method for Circle
        c.draw();
    }
}
