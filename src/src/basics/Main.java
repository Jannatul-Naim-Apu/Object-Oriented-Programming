package basics;

// Hello World, Java identifiers, basic operators
public class Main {
    public static void main(String[] args) {
        int age = 22; // variable declaration
        String name = "Naim"; // identifier
        System.out.println("Hello " + name + ", Age: " + age);

        // Control statement
        if(age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        // Array example
        int[] numbers = {10, 20, 30};
        for(int num : numbers) {
            System.out.println(num);
        }
    }
}
