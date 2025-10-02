package oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));      // calls int version
        System.out.println(calc.add(5.5, 10.5));  // calls double version
    }
}