import java.util.Scanner;

public class StubbornPasswordPrompt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String secretPassword = "Java@123";  // Hardcoded password
        String enteredPassword;

        // do-while ensures prompt appears at least once
        do {
            System.out.print("Enter the password: ");
            enteredPassword = scanner.nextLine();

            if (!enteredPassword.equals(secretPassword)) {
                System.out.println("Incorrect password. Try again.\n");
            }

        } while (!enteredPassword.equals(secretPassword));

        System.out.println("Access Granted!");

        scanner.close();
    }
}
