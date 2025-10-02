package nested.inner;

class Outer {
    int outerVar = 10;

    // Inner class
    class Inner {
        int innerVar = 20;

        void display() {
            System.out.println("Inner Var: " + innerVar);
            System.out.println("Access Outer Var: " + outerVar);
        }
    }
}