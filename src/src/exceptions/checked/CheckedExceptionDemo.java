package exceptions.checked;

import java.io.*;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("=== Checked Exception Example ===");
        try {
            FileReader fr = new FileReader("nonexistentfile.txt");
            fr.read();
            fr.close();
        } catch (IOException e) {
            System.out.println("Caught Checked Exception: " + e);
        }
    }
}
