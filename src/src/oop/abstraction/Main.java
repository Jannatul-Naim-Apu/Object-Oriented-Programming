package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle(); // Polymorphic reference
        s.draw();               // calls implemented draw() method
    }
}