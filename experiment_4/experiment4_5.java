class Employee {
    
    int employeeID;
    String name;
    String department;
    private double salary;

   
    static int totalEmployees = 0;

    
    Employee() {
        employeeID = 0;
        name = "Default Name";
        department = "Default Department";
        salary = 0.0;
        totalEmployees++;
    }

    
    Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }

  
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    
    public double calculateSalary() {
        return salary;
    }

    
    void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

public class experiment4_5 {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee();

        
        Employee emp2 = new Employee(101, "Alice", "HR", 50000.0);
        Employee emp3 = new Employee(102, "Bob", "IT", 60000.0);
        emp1.displayEmployeeInfo();
    }
}
