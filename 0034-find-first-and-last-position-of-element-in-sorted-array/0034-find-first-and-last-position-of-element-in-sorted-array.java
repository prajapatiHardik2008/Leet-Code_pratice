class Solution {

    public int[] searchRange(int[] nums, int target) {

        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int first = -1;
        int last = -1;

        // Find first occurrence
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {

                first = mid;
                high = mid - 1;   // left jao

            } 
            else if (nums[mid] > target) {

                high = mid - 1;

            } 
            else {

                low = mid + 1;
            }
        }


        // Find last occurrence
        low = 0;
        high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {

                last = mid;
                low = mid + 1;    // right jao

            } 
            else if (nums[mid] > target) {

                high = mid - 1;

            } 
            else {

                low = mid + 1;
            }
        }

        return new int[]{first, last};
    }
}