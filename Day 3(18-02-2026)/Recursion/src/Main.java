class GeometryCalculator {

    //  Calculate area of a Circle
    double calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
        return area;
    }

    //  Calculate area of a Rectangle
    int calculateArea(int length, int width) {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
        return area;
    }

    //  Calculate area of a Triangle
    double calculateArea(double base, double height, boolean isTriangle) {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
        return area;
    }
}

public class Main {
    public static void main(String[] args) {

        GeometryCalculator obj = new GeometryCalculator();

        // Calling overloaded methods
        obj.calculateArea(5.5);              // Circle
        obj.calculateArea(10, 20);           // Rectangle
        obj.calculateArea(6.0, 4.0, true);   // Triangle
    }
}
