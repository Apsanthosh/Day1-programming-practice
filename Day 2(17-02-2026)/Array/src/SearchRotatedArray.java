public class SearchRotatedArray {

    public static int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Step 1: Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Step 2: Check which half is sorted
            if (nums[low] <= nums[mid]) {
                // Left half is sorted

                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;   // Search left
                } else {
                    low = mid + 1;    // Search right
                }

            } else {
                // Right half is sorted

                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;    // Search right
                } else {
                    high = mid - 1;   // Search left
                }
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println("Index = " + search(arr, target));
    }
}
