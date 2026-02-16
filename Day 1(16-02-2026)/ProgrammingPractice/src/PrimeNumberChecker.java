import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Handle invalid cases
        if (number <= 1) {
            System.out.println(number + " is NOT a prime number.");
        } else {

            boolean isPrime = true;

            // Check divisibility only up to sqrt(number)
            for (int i = 2; i <= Math.sqrt(number); i++) {

                if (number % i == 0) {
                    isPrime = false;
                    break;  // Stop early if divisor found
                }
            }

            // Print result
            if (isPrime) {
                System.out.println(number + " is a PRIME number.");
            } else {
                System.out.println(number + " is NOT a prime number.");
            }
        }

        scanner.close();
    }
}
