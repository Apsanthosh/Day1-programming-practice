public class SlidingWindowMaxSum {

    public static int maxSumSubarray(int[] arr, int k) {

        if (arr.length < k) {
            throw new IllegalArgumentException("Array size is smaller than k");
        }

        // Step 1: Compute first window sum
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum - arr[i - k] + arr[i];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println("Maximum Sum = " + maxSumSubarray(arr, k));
    }
}
