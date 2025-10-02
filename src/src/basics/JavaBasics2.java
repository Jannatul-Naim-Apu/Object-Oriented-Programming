package basics;

public class JavaBasics2 {

    // Class level variable (instance variable)
    int instanceVar = 100;

    public static void main(String[] args) {

        // Local variable
        int localVar = 50;
        System.out.println("Local variable: " + localVar);

        // Control statements: if-else
        int num = 10;
        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is zero");
        }

        // Switch case
        int day = 3;
        switch(day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Other day");
        }

        // Arrays
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Enhanced for loop
        for (int numElement : numbers) {
            System.out.println("Element: " + numElement);
        }

        // Reference variable and pass-by-value
        int a = 5;
        int b = 10;
        swapValues(a, b); // primitive type: pass-by-value
        System.out.println("After swapValues (primitive): a=" + a + " b=" + b);

        // Reference type
        int[] arr = {1, 2, 3};
        modifyArray(arr); // reference type: changes reflected
        System.out.print("Array after modifyArray: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        // Garbage collection
        JavaBasics2 obj1 = new JavaBasics2();
        JavaBasics2 obj2 = new JavaBasics2();
        obj1 = null;
        obj2 = null;
        System.gc(); // request garbage collection
        System.out.println("Garbage collection requested.");
    }

    static void swapValues(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 10;
        }
    }

    void instanceMethodScope() {
        // Accessing instance variable
        System.out.println("Instance variable: " + instanceVar);
    }
}
