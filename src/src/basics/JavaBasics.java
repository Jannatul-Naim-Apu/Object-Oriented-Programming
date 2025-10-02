package basics;

public class JavaBasics {

    // Application class example: main method
    public static void main(String[] args) {

        // Why Java?
        System.out.println("Java is platform independent, object-oriented, and widely used!");

        // Identifiers examples
        int age = 22;
        String name = "Naim";
        double salary = 5500.75;
        char grade = 'A';
        boolean isStudent = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student? " + isStudent);

        // Operators
        int a = 10;
        int b = 5;

        // Arithmetic operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational operators
        System.out.println("a > b? " + (a > b));
        System.out.println("a < b? " + (a < b));
        System.out.println("a == b? " + (a == b));
        System.out.println("a != b? " + (a != b));

        // Logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        // Increment & Decrement
        int c = 7;
        System.out.println("c++ = " + (c++));
        System.out.println("++c = " + (++c));

        // Application class concept
        JavaBasics app = new JavaBasics();
        app.sayHello();
    }

    // Instance method
    void sayHello() {
        System.out.println("Hello from the Application Class instance method!");
    }
}
