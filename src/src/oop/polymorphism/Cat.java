package oop.polymorphism;

class Cat extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Meow");
    }
}
