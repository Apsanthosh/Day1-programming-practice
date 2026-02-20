import java.util.Scanner;

public class LongestPalindromicSubstring {

    // Helper method to expand around center
    public static String expandFromCenter(String s, int left, int right) {

        // Expand while valid and characters match
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // Return the palindrome substring
        return s.substring(left + 1, right);
    }

    public static String longestPalindrome(String s) {

        if (s == null || s.length() < 1) {
            return "";
        }

        String longest = "";

        // Try every character as center
        for (int i = 0; i < s.length(); i++) {

            // Case 1: Odd length palindrome (single center)
            String oddPalindrome = expandFromCenter(s, i, i);

            // Case 2: Even length palindrome (double center)
            String evenPalindrome = expandFromCenter(s, i, i + 1);

            // Update longest
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }

            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = longestPalindrome(input);

        System.out.println("Longest Palindromic Substring: " + result);

        scanner.close();
    }
}