public class RecursivePalindromeChecker {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int left, int right) {

        // Base Case 1: All characters checked
        if (left >= right) {
            return true;
        }

        // Base Case 2: Mismatch found
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive Step: Move inward
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        String input = "madam";

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}
