package oop.polymorphism;


public class Main2 {
    public static void main(String[] args) {
        Animal myCat = new Cat(); // Polymorphic reference
        myCat.sound(); // calls overridden method in Cat
    }
}