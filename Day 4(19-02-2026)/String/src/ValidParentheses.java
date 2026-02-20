import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ValidParentheses {

    public static boolean isValid(String s) {

        // Use Deque as stack (faster than Stack class)
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {

            // Step 1: Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Step 2: Handle closing brackets
            else {
                // If stack empty → no matching opening
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Step 3: Check matching type
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Step 4: Stack must be empty for valid string
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String input = scanner.nextLine();

        if (isValid(input)) {
            System.out.println("The string is VALID.");
        } else {
            System.out.println("The string is INVALID.");
        }

        scanner.close();
    }
}