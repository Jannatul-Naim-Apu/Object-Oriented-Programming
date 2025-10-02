package build_in_method;

public class EqualsToStringDemo {
    public static void main(String[] args) {

        Student s1 = new Student("Naim", 22);
        Student s2 = new Student("Ali", 20);
        Student s3 = new Student("Naim", 22);

        // Using toString()
        System.out.println("Student 1: " + s1);
        System.out.println("Student 2: " + s2);

        // Using equals()
        System.out.println("s1 equals s2? " + s1.equals(s2));
        System.out.println("s1 equals s3? " + s1.equals(s3));

        // Comparing references
        Student s4 = s1;
        System.out.println("s1 equals s4? " + s1.equals(s4));

        // Array of objects with toString
        Student[] students = {s1, s2, s3};
        System.out.println("All Students:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
