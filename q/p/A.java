package p;

public class A {
    
    // Public method - accessible from anywhere
    public void publicMethod() {
        System.out.println("Public method accessed");
    }

    // Protected method - accessible within the same package or through inheritance
    protected void protectedMethod() {
        System.out.println("Protected method accessed");
    }

    // Default method - accessible only within the same package
    void defaultMethod() {
        System.out.println("Default method accessed");
    }

    // Private method - accessible only within the same class
    private void privateMethod() {
        System.out.println("Private method accessed");
    }

    // Method to indirectly access private method (for testing)
    public void accessPrivateMethod() {
        privateMethod();
    }
}
