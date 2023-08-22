/*2. Write a program in Java to implement abstract classes. Create an abstract class
animal having an abstract method animalSound(). Create subclass dog from
superclass animal. Access the abstract class method by creating the object of
subclass to implement data abstraction. */
abstract class Animal {
  int age;
  public abstract void animalSound();
	public void sleep() {
		System.out.println("Hello");
	}
}
class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says bow-bow");
  }
}
public class Main {
  public static void main(String[] args){
    Dog dog = new Dog();
    dog.animalSound();
    dog.sleep();
  }
}
