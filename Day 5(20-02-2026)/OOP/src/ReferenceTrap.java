// ReferenceTrap.java

class Box {

    // Instance variables
    int width;
    int height;
    int depth;
}

public class ReferenceTrap {

    public static void main(String[] args) {

        // Step 1: Create first Box object
        Box b1 = new Box();

        // Step 2: Set dimensions of b1
        b1.width = 10;
        b1.height = 10;
        b1.depth = 10;

        // Step 3: Assign b2 to reference the same object as b1
        Box b2 = b1;

        // Step 4: Modify width using b2 reference
        b2.width = 50;

        // Step 5: Print width using b1 reference
        System.out.println("b1.width = " + b1.width);
    }
}