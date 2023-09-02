import java.util.Vector;

public class VectorMethodsExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Accessing elements
        System.out.println("Element at index 1: " + vector.get(1));

        // Changing an element
        vector.set(1, "Grapes");

        // Removing an element
        vector.remove(0);

        // Size of the Vector
        System.out.println("Vector size: " + vector.size());

        // Checking if the Vector is empty
        System.out.println("Is Vector empty? " + vector.isEmpty());

        // Index of an element
        System.out.println("Index of 'Grapes': " + vector.indexOf("Grapes"));

        // Checking if an element exists
        System.out.println("Contains 'Orange'? " + vector.contains("Orange"));

        // Adding elements at specific index
        vector.add(1, "Mango");
        vector.add(2, "Pineapple");

        // Sublist
        System.out.println("Sublist: " + vector.subList(1, 4));

        // Clearing the Vector
        vector.clear();

        // Adding all elements from another collection
        Vector<String> newElements = new Vector<>();
        newElements.add("Cherry");
        newElements.add("Kiwi");
        vector.addAll(newElements);

        // Converting Vector to an Array
        String[] array = vector.toArray(new String[0]);

        // Printing elements
        System.out.println("Vector elements: " + vector);
    }
}
