import java.util.Vector;

class Main {
    public static void main(String[] args) {
        // Create a Vector of strings
        Vector<String> vec = new Vector<>();

        // 1. Add elements
        vec.add("Ajaykumar");
        vec.add("Bianca");
        vec.add("Kevin");

        // 2. Accessing elements
        System.out.println("Element at index 2: " + vec.get(2));

        // 3. Changing elements
        vec.set(2, "Subhodeep");
        System.out.println("Element at index 2: " + vec.get(2));

        // 4. Remove element at index 1
        vec.remove(1);
        System.out.println("Element at index 1: " + vec.get(1));

        // 5. Check size
        System.out.println("Vector size: " + vec.size());

        // 6. Check if empty
        System.out.println("Is vector Empty?: " + vec.isEmpty());
    }
}
