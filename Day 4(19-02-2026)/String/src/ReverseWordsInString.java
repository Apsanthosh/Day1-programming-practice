import java.util.Scanner;

public class ReverseWordsInString {

    public static String reverseWords(String s) {

        // Step 1: Remove leading and trailing spaces
        s = s.trim();

        // Step 2: Split using regex to handle multiple spaces
        String[] words = s.split("\\s+");

        // Step 3: Build reversed sentence using StringBuilder
        StringBuilder result = new StringBuilder();

        // Traverse from last word to first
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            // Add space only if not the last appended word
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String reversed = reverseWords(input);

        System.out.println("Reversed sentence: " + reversed);

        scanner.close();
    }
}