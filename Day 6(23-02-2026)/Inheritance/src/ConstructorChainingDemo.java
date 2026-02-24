// Parent Class
class Person {

    String name;

    // Parameterized constructor (NO default constructor)
    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called");
    }
}

// Child Class
class Employee extends Person {

    int employeeId;

    // Employee constructor MUST call super(name)
    Employee(String name, int employeeId) {

        super(name); // Calls Person constructor FIRST (Constructor Chaining)

        this.employeeId = employeeId;
        System.out.println("Employee constructor called");
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

// Main Class
public class ConstructorChainingDemo {

    public static void main(String[] args) {

        Employee emp = new Employee("Santhosh", 10315);
        emp.displayDetails();
    }
}