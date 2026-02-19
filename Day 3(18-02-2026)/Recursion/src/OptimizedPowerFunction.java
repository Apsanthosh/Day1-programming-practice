public class OptimizedPowerFunction {

    // Recursive Optimized Power Method
    public static long power(int x, int n) {

        // Base Case
        if (n == 0) {
            return 1;
        }

        // Recursive call for half exponent
        long half = power(x, n / 2);

        // If n is even
        if (n % 2 == 0) {
            return half * half;
        }
        // If n is odd
        else {
            return x * half * half;
        }
    }

    public static void main(String[] args) {

        int x = 2;
        int n = 10;

        long result = power(x, n);

        System.out.println(x + "^" + n + " = " + result);
    }
}
