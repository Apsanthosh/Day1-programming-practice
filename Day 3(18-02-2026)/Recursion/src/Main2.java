class PassByValueDemo {

    // Method to modify primitive
    void modifyPrimitive(int x) {
        System.out.println("Inside modifyPrimitive - Before change: " + x);
        x = 99;  // Only changes local copy
        System.out.println("Inside modifyPrimitive - After change: " + x);
    }

    // Method to modify array
    void modifyArray(int[] arr) {
        System.out.println("Inside modifyArray - Before change: " + arr[0]);
        arr[0] = 99;  // Modifies the actual object
        System.out.println("Inside modifyArray - After change: " + arr[0]);
    }
}

public class Main2 {
    public static void main(String[] args) {

        PassByValueDemo obj = new PassByValueDemo();

        int a = 10;
        int[] b = {10, 20};

        System.out.println("Before method call:");
        System.out.println("a = " + a);
        System.out.println("b[0] = " + b[0]);

        obj.modifyPrimitive(a);
        obj.modifyArray(b);

        System.out.println("\nAfter method call:");
        System.out.println("a = " + a);       // Will remain 10
        System.out.println("b[0] = " + b[0]); // Will become 99
    }
}
