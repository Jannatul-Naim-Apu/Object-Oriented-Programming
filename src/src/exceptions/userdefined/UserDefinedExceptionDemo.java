package exceptions.userdefined;

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("=== User Defined Exception Example ===");
        try {
            checkAge(15);
        } catch (AgeException e) {
            System.out.println("Caught User-Defined Exception: " + e.getMessage());
        }

        try {
            checkAge(20); // Valid
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int age) throws AgeException {
        if (age < 18) throw new AgeException("Age must be 18 or older");
        else System.out.println("Age is valid: " + age);
    }
}
