// RectangleConstructorOverloader.java

class Rectangle {

    int length;
    int width;

    // 1️ Default Constructor (No Arguments)
    Rectangle() {
        length = 1;
        width = 1;
        System.out.println("Default constructor called (1x1 rectangle created)");
    }

    // 2️ Single-Argument Constructor (Creates Square)
    Rectangle(int side) {
        length = side;
        width = side;
        System.out.println("Single-argument constructor called (Square created)");
    }

    // 3️ Two-Argument Constructor (Length and Width separately)
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Two-argument constructor called (Rectangle created)");
    }

    // Method to display rectangle details
    void display() {
        System.out.println("Length: " + length + ", Width: " + width);
        System.out.println("Area: " + (length * width));
        System.out.println("-----------------------------");
    }
}

public class RectangleConstructorOverloader {

    public static void main(String[] args) {

        // Using Default Constructor
        Rectangle r1 = new Rectangle();
        r1.display();

        // Using Single-Argument Constructor (Square)
        Rectangle r2 = new Rectangle(5);
        r2.display();

        // Using Two-Argument Constructor
        Rectangle r3 = new Rectangle(4, 6);
        r3.display();
    }
}