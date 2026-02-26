// EmployeeChainingDemo.java

class Employee {

    int id;
    String name;
    String department;
    double salary;

    // Master Constructor (All Fields Initialized Here)
    Employee(int id, String name, String department, double salary) {
        System.out.println("Master constructor called");

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    //  Constructor with only ID and Name
    // Calls master constructor using this()
    Employee(int id, String name) {
        this(id, name, "Unassigned", 0.0);  // Constructor Chaining
        System.out.println("Two-argument constructor called");
    }

    //  Constructor with ID, Name, Department
    // Calls master constructor with default salary
    Employee(int id, String name, String department) {
        this(id, name, department, 30000.0); // Default salary
        System.out.println("Three-argument constructor called");
    }

    // Method to display employee details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("-----------------------------");
    }
}

public class EmployeeChainingDemo {

    public static void main(String[] args) {

        //  Using Master Constructor
        Employee e1 = new Employee(101, "Alice", "HR", 50000);
        e1.display();

        //  Using Constructor with ID and Name
        Employee e2 = new Employee(102, "Bob");
        e2.display();

        //  Using Constructor with ID, Name, Department
        Employee e3 = new Employee(103, "Charlie", "IT");
        e3.display();
    }
}