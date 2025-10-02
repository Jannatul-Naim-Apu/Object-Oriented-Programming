package collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;




public class SortingDemo {
    public static void main(String[] args) {
        System.out.println("=== ArrayList Sorting Example ===");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Naim", 22));
        students.add(new Student("Ali", 20));
        students.add(new Student("Sara", 25));
        students.add(new Student("Zara", 18));

        System.out.println("Original List:");
        System.out.println(students);

        // Sorting using Comparable (by age)
        Collections.sort(students);
        System.out.println("Sorted by age (Comparable):");
        System.out.println(students);

        // Sorting using Comparator (by name)
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });
        System.out.println("Sorted by name (Comparator):");
        System.out.println(students);

        // Lambda Comparator example
        students.sort((s1, s2) -> s2.age - s1.age); // descending age
        System.out.println("Sorted by age descending (Lambda Comparator):");
        System.out.println(students);
    }
}