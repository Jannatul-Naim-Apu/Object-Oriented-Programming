package collections.setmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetMapDemo {
    public static void main(String[] args) {

        System.out.println("=== HashSet Example ===");
        Set<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicate, will be ignored

        System.out.println("Fruits HashSet: " + fruits);

        // Check element existence
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Remove element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        System.out.println("\n=== HashMap Example ===");
        Map<Integer, String> students = new HashMap<>();

        // Adding key-value pairs
        students.put(101, "Naim");
        students.put(102, "Ali");
        students.put(103, "Sara");

        System.out.println("Students HashMap: " + students);

        // Access value by key
        System.out.println("Student with ID 102: " + students.get(102));

        // Remove entry
        students.remove(103);
        System.out.println("After removing ID 103: " + students);

        // Iterate using for-each
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Check if key/value exists
        System.out.println("Contains key 101? " + students.containsKey(101));
        System.out.println("Contains value 'Ali'? " + students.containsValue("Ali"));
    }
}
