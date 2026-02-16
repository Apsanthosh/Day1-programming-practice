import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {

            long factorial = 1;   // Accumulator variable
            int i = number;       // Counter

            // While loop to calculate factorial
            while (i > 0) {
                factorial = factorial * i;
                i--;  // Important to prevent infinite loop
            }

            System.out.println(number + "! = " + factorial);
        }

        scanner.close();
    }
}
