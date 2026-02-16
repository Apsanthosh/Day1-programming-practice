import java.util.Scanner;

public class VowelConsonantSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a single alphabet: ");
        String input = scanner.next();

        // Validate input (must be one character and alphabet)
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a single alphabet character.");
        } else {

            // Convert to lowercase to handle both cases
            char ch = Character.toLowerCase(input.charAt(0));

            // Switch to check vowel or consonant
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a Vowel.");
                    break;

                default:
                    System.out.println(ch + " is a Consonant.");
            }
        }

        scanner.close();
    }
}
