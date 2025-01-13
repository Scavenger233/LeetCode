class Solution {
    public void moveZeroes(int[] nums) {
        // Two pointers
        int fast = 0;
        int slow = 0;

        // Fast pointer iterate all values, and put non zeros to nums array
        for (fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                //Count slow++ every time 
                slow++;
            }
        }

        // Count the rest of the slots as 0
        for (int j = slow; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}