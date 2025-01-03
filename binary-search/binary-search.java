class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // [ , ) 
        while(left < right) {
            // To prevent boundary issue
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                //if target is on the left side, we use mid as the right boundry
                right = mid;
            } else {
                // If taget is on the right side, middle is already counted in the closure, so we use mid + 1 as the left boundry
                left = mid + 1;
            }
        }

        return -1;
    }
}