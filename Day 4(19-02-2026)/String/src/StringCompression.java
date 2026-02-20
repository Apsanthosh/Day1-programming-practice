import java.util.Scanner;

public class StringCompression {

    public static String compressString(String str) {

        // Edge case: empty or single character
        if (str == null || str.length() <= 1) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        // Traverse string
        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;  // same character → increase count
            } else {
                // append previous character and its count
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1;  // reset count
            }
        }

        // Append last character group
        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);

        // Return shorter string only
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = compressString(input);

        System.out.println("Result: " + result);

        scanner.close();
    }
}