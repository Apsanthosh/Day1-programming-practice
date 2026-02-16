import java.util.Scanner;

public class RightAngledTrianglePattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for number of rows
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
