import java.util.Scanner;

public class CenteredPyramidPattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for number of rows
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop controls rows
        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars (odd count)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }

        scanner.close();
    }
}
