import java.util.Scanner;

public class MultiplicationTableGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("\nMultiplication Table for " + number + ":\n");

        // Generate table using for loop
        for (int i = 1; i <= 16; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
