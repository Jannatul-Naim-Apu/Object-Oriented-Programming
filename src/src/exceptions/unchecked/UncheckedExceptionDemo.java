package exceptions.unchecked;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("=== Unchecked Exception Example ===");
        int a = 10, b = 0;

        try {
            int result = a / b; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception: " + e);
        }

        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Array Exception: " + e.getMessage());
        }
    }
}
