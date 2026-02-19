public class CallStackPrinter {

    // 🔽 Count Down Method
    // Prints first, then makes recursive call
    public static void countDown(int n) {
        if (n == 0) {
            return; // Base Case
        }

        System.out.println("countDown: " + n);
        countDown(n - 1);
    }

    // 🔼 Count Up Method
    // Makes recursive call first, then prints
    public static void countUp(int n) {
        if (n == 0) {
            return; // Base Case
        }

        countUp(n - 1);
        System.out.println("countUp: " + n);
    }

    // Main Method
    public static void main(String[] args) {

        int number = 5;

        System.out.println("=== Count Down Execution ===");
        countDown(number);

        System.out.println("\n=== Count Up Execution ===");
        countUp(number);
    }
}
