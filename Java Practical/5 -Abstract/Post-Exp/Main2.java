/* Create one abstract class shape and abstract method draw. Create class rectangle and circle that will inherit
method from Shape class.Make necessary assumptions. */

abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape {
    void draw() {}
}
