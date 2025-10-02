package build_in_method;

public class StaticFinalDemo {
    public static void main(String[] args) {
        System.out.println("Main method started");

        // Access static variable and method without object
        System.out.println("Static count before object: " + Demo.staticCount);
        Demo.showStaticCount();

        // Create objects
        Demo d1 = new Demo(1);
        Demo d2 = new Demo(2);

        // Access final variable
        d1.displayID();
        d2.displayID();

        // Static method reflects updated count
        Demo.showStaticCount();
    }
}