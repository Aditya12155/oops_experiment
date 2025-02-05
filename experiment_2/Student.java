public class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this.name = "Default Name";
        this.age = 18;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        Student defaultStudent = new Student();
        defaultStudent.display();

        // Creating an object using the parameterized constructor
        Student customStudent = new Student("John Doe", 21);
        customStudent.display();
    }
}
