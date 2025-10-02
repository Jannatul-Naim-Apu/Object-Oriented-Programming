package oop.encapsulation;

// Class demonstrating oop.encapsulation
class Person {
    private String name; // private field
    private int age;     // private field

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}


