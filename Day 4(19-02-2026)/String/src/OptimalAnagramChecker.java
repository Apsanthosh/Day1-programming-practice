import java.util.Scanner;

public class OptimalAnagramChecker {

    public static boolean isAnagram(String s1, String s2) {

        // Step 1: If lengths differ → not anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: Create frequency counter for 26 alphabets
        int[] freq = new int[26];

        // Step 3: Traverse both strings together
        for (int i = 0; i < s1.length(); i++) {

            // Increment for first string
            char c1 = s1.charAt(i);
            freq[c1 - 'a']++;

            // Decrement for second string
            char c2 = s2.charAt(i);
            freq[c2 - 'a']--;
        }

        // Step 4: Check if all counts are zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().toLowerCase();

        // Check anagram
        if (isAnagram(str1, str2)) {
            System.out.println("The strings are ANAGRAMS.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }

        scanner.close();
    }
}