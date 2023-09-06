/* Create one abstract class shape and abstract method draw. Create class rectangle and circle that will inherit
method from Shape class.Make necessary assumptions. */

abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("To draw a rectangle: ");
        System.out.println("Step 1: Draw a line.\nStep 2: Turn 90 degree.\nStep 3: Repeat Step 1 and Step 2 three more times.\n");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("To draw a circle: ");
        System.out.println("Step 1: Take a center point\nStep 2:Draw a circle of desired radius.\n ");
    }
}
class Main2 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
    }
}
