package nested.anonymous;

interface Greeting {
    void sayHello();
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        // Anonymous class implementing interface
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Class!");
            }
        };

        g.sayHello();

        // Anonymous class extending a class
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("Running from Anonymous Thread Class!");
            }
        };
        t.start();
    }
}
