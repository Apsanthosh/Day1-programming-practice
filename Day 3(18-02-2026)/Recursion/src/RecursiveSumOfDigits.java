public class RecursiveSumOfDigits {

    // Recursive method to calculate sum of digits
    public static int sumOfDigits(int number) {

        // Base Case: single digit
        if (number < 10) {
            return number;
        }

        // Recursive Step
        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {

        int num = 253;

        int result = sumOfDigits(num);

        System.out.println("Number: " + num);
        System.out.println("Sum of Digits: " + result);
    }
}
