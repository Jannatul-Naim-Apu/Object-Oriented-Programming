package oop.abstraction;

// Concrete class must implement abstract methods
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}