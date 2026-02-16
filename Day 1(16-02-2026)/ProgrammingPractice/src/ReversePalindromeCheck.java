import java.util.Scanner;

public class ReversePalindromeCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number; // Store original value
        int reversedNumber = 0;

        // Reverse the number using while loop
        while (number != 0) {

            int digit = number % 10;              // Get last digit
            reversedNumber = reversedNumber * 10 + digit; // Build reversed number
            number = number / 10;                 // Remove last digit
        }

        System.out.println("Reversed Number: " + reversedNumber);

        // Check palindrome
        if (originalNumber == reversedNumber) {
            System.out.println("It is a PALINDROME number.");
        } else {
            System.out.println("It is NOT a palindrome number.");
        }

        scanner.close();
    }
}
