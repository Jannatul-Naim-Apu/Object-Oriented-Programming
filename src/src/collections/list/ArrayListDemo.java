package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        System.out.println("=== ArrayList Example ===");

        // Create ArrayList using List interface
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Fruits List: " + fruits);

        // Access elements
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Third fruit: " + fruits.get(2));

        // Remove element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Iterate using for-each loop
        System.out.println("Iterating over list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Size of the list
        System.out.println("Number of fruits: " + fruits.size());

        // Check if list contains an element
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Clear the list
        //fruits.clear();
        //System.out.println("After clearing: " + fruits);
    }
}
