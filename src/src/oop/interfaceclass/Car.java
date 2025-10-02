package oop.interfaceclass;

// Implementing interface in a class
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }
}