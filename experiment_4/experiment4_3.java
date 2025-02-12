class University {
    static String universityName = "Global University"; 
    String studentName;
    public University(String studentName) {
        this.studentName = studentName;
    }
    static void displayUniversityName() {
        System.out.println("University: " + universityName);
    }
    void displayStudentDetails() {
        System.out.println("Student Name: " + studentName + ", University: " + universityName);
    }
}

public class experiment4_3 {
    public static void main(String[] args) {
        University.displayUniversityName();
        University student1 = new University("Alice");
        University student2 = new University("Bob");
        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }
}