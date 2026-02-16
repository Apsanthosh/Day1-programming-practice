import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {

            int first = 0, second = 1;

            System.out.println("Fibonacci Sequence:");

            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");

                // Calculate next term
                int next = first + second;
                first = second;
                second = next;
            }
        }

        scanner.close();
    }
}
