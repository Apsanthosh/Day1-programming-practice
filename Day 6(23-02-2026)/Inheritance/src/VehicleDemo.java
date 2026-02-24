// Base Class
class Vehicle {

    String brand;
    int speed;

    // Constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to start engine
    void startEngine() {
        System.out.println(brand + " engine started. Current speed: " + speed + " km/h");
    }
}

// Subclass Car
class Car extends Vehicle {

    int numberOfDoors;

    // Constructor
    Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);   // Call parent constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Car-specific method
    void displayCarInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {

    boolean hasSidecar;

    // Constructor
    Motorcycle(String brand, int speed, boolean hasSidecar) {
        super(brand, speed);   // Call parent constructor
        this.hasSidecar = hasSidecar;
    }

    // Motorcycle-specific method
    void displayMotorcycleInfo() {
        System.out.println("Motorcycle Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}

// Main Class
public class VehicleDemo {

    public static void main(String[] args) {

        // Create Car object
        Car car = new Car("Toyota", 120, 4);

        // Create Motorcycle object
        Motorcycle bike = new Motorcycle("Harley-Davidson", 100, true);

        // Call inherited method
        car.startEngine();
        bike.startEngine();

        System.out.println();

        // Call subclass methods
        car.displayCarInfo();
        System.out.println();
        bike.displayMotorcycleInfo();
    }
}