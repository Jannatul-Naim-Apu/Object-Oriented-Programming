package oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // inherited method from Animal
        d.bark(); // own method of Dog
    }
}