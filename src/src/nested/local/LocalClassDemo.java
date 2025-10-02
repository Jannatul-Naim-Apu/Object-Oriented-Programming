package nested.local;

public class LocalClassDemo {
    void outerMethod() {
        int localVar = 50; // Must be effectively final for inner class

        // Local class inside method
        class Local {
            void show() {
                System.out.println("Access localVar from method: " + localVar);
            }
        }

        Local local = new Local();
        local.show();
    }

    public static void main(String[] args) {
        LocalClassDemo demo = new LocalClassDemo();
        demo.outerMethod();
    }
}
