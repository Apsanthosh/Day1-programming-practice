import java.util.Scanner;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {

        // ASCII character tracking (can also use HashSet)
        boolean[] seen = new boolean[256];

        int left = 0;          // Left pointer of window
        int maxLength = 0;     // Result

        // Expand window using right pointer
        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            // If character already exists, shrink window from left
            while (seen[current]) {
                seen[s.charAt(left)] = false;
                left++;
            }

            // Mark current character as seen
            seen[current] = true;

            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int result = lengthOfLongestSubstring(input);

        System.out.println("Length of longest substring without repeating characters: " + result);

        scanner.close();
    }
}