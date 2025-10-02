package build_in_method;

class Demo {
    // Static variable
    static int staticCount = 0;

    // Final variable
    final int id;

    // Instance block (executed every time an object is created)
    {
        System.out.println("Instance block executed");
    }

    // Static block (executed once when class is loaded)
    static {
        System.out.println("Static block executed");
        staticCount = 100;
    }

    // Constructor
    Demo(int id) {
        this.id = id;
        staticCount++;
        System.out.println("Constructor executed for ID: " + id);
    }

    // Static method
    static void showStaticCount() {
        System.out.println("Static count: " + staticCount);
    }

    // Final method (cannot be overridden)
    final void displayID() {
        System.out.println("ID: " + id);
    }
}
