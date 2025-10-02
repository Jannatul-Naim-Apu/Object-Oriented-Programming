package oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Naim");  // using setter to set name
        p.setAge(22);       // using setter to set age

        System.out.println("Name: " + p.getName()); // using getter to get name
        System.out.println("Age: " + p.getAge());   // using getter to get age
    }
}