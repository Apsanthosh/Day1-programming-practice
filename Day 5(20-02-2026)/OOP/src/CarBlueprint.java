// CarBlueprint.java

class Car {

    // Instance Variables (Each object will have its own copy)
    String make;
    String model;
    int year;
    double currentSpeed;

    // Constructor to initialize the car
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.currentSpeed = 0.0; // Car starts from rest
    }

    // Method to increase speed
    void accelerate(double speedIncrease) {
        if (speedIncrease > 0) {
            currentSpeed += speedIncrease;
            System.out.println(make + " " + model + " accelerated by " + speedIncrease + " km/h");
        }
    }

    // Method to decrease speed
    void brake(double speedDecrease) {
        if (speedDecrease > 0) {
            currentSpeed -= speedDecrease;

            // Speed should not go below zero
            if (currentSpeed < 0) {
                currentSpeed = 0;
            }

            System.out.println(make + " " + model + " slowed down by " + speedDecrease + " km/h");
        }
    }

    // Method to display current status
    void displayStatus() {
        System.out.println(year + " " + make + " " + model +
                " | Current Speed: " + currentSpeed + " km/h");
    }
}

public class CarBlueprint {

    public static void main(String[] args) {

        // Instantiate two different Car objects
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2021);

        // Accelerate them at different rates
        car1.accelerate(50);
        car1.accelerate(20);

        car2.accelerate(30);
        car2.brake(10);
        car2.accelerate(40);

        // Print final speeds (showing separate states)
        System.out.println("\nFinal Status of Cars:");
        car1.displayStatus();
        car2.displayStatus();
    }
}