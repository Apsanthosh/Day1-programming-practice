import java.util.Scanner;
import java.util.regex.Pattern;

public class StrictPasswordValidator {

    // Single regex pattern with lookaheads
    private static final String PASSWORD_REGEX =
            "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%&]).{8,}$";

    private static final Pattern pattern = Pattern.compile(PASSWORD_REGEX);

    public static boolean isValidPassword(String password) {
        return pattern.matcher(password).matches();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password to validate: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is VALID ");
        } else {
            System.out.println("Password is INVALID ");
            System.out.println("Password must:");
            System.out.println("- Be at least 8 characters long");
            System.out.println("- Contain at least one uppercase letter");
            System.out.println("- Contain at least one lowercase letter");
            System.out.println("- Contain at least one digit");
            System.out.println("- Contain at least one special character (@#$%&)");
        }

        scanner.close();
    }
}