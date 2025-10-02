package io.read;

import java.io.*;

public class FileReadDemo {
    public static void main(String[] args) {

        // File path (create "input.txt" in project folder)
        String filePath = "input.txt";

        System.out.println("=== FileReader + BufferedReader Example ===");

        try {
            // FileReader reads characters from file
            FileReader fr = new FileReader(filePath);

            // BufferedReader for efficient reading
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close(); // Close BufferedReader
            fr.close(); // Close FileReader
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

        System.out.println("\n=== Reading with FileInputStream (byte-wise) ===");
        try {
            FileInputStream fis = new FileInputStream(filePath);
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
