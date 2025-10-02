package io.write;

import java.io.*;

public class FileWriteDemo {
    public static void main(String[] args) {

        // File path (output.txt will be created in project folder)
        String filePath = "output.txt";

        System.out.println("=== FileWriter + BufferedWriter Example ===");
        try {
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Hello, this is the first line.");
            bw.newLine();
            bw.write("This is the second line.");
            bw.newLine();
            bw.write("BufferedWriter makes writing efficient.");

            bw.close();
            fw.close();

            System.out.println("Data written successfully using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

        System.out.println("\n=== PrintWriter Example ===");
        try {
            PrintWriter pw = new PrintWriter(filePath); // overwrites file
            pw.println("Hello from PrintWriter!");
            pw.println("This is another line.");
            pw.println("PrintWriter allows easy writing with println.");

            pw.close();
            System.out.println("Data written successfully using PrintWriter.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
