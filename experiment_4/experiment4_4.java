class Course {
    String courseName;
    String courseCode;
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    public void display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}

public class experiment4_4 {
    public static void main(String[] args) {
        Course course = new Course("Oops Programming", "CS00");
        course.display();
    }
}
