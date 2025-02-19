class MathConstants {
    final double PI = 3.14159;

    // Final method (cannot be overridden)
    final void displayPI() {
        System.out.println("Value of PI: " + PI);
    }
}
class Circle extends MathConstants {

    // Method to calculate and print the area of a circle
    void calculateArea(double radius) {
        double area = PI * radius * radius; 
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }

    
    // @Override
    // void displayPI() {
    //     System.out.println("Trying to override final method!"); //  Compilation error
    // }
    
}
public class exp6_3 {
    public static void main(String[] args) {
        Circle c = new Circle();
        
        c.displayPI(); // Calls final method from MathConstants
        c.calculateArea(5.0); // Calculates area with radius 5.0

    
        // c.PI = 3.14; //  Compilation error: cannot assign a value to final variable 'PI'
        
    }
}
