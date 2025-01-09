class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftBorder = leftBorder(nums, target);
        int rightBorder = rightBorder(nums, target);

        if (leftBorder == -12 || rightBorder == -2) {
            return new int[]{-1, -1};
        }

        if (rightBorder - leftBorder >1) {
            return new int[]{leftBorder + 1, rightBorder - 1};
        }
        
        return new int[]{-1, -1};
    }

    int leftBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int leftBorder = -2;

        // To find left border
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target ) {
                right = mid - 1;
                leftBorder = right;
            } else {
                left = mid + 1;
            }
        }

        return leftBorder;
    }

    int rightBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int rightBorder = -2;

        // To find right border
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
                rightBorder = left;
            } else{
                right = mid - 1;
            }
        }

        return rightBorder;
    }
}