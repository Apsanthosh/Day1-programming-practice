public class FibonacciTreeRecursion {

    // Recursive Fibonacci Method
    public static int fibonacci(int n) {

        // Base Cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive Calls (Tree Recursion)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int n = 10;

        System.out.println("Fibonacci Series up to " + n + ":");

        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("\n\n" + n + "th Fibonacci Number = " + fibonacci(n));
    }
}
