class Solution {
    public int removeDuplicates(int[] nums) {
        int fast = 1; // 第一个值无论如何都要保留，所以我们从第二个值开始算起

        // 循环从第二个index开始
        for (int i = 1; i <= nums.length - 1; i++) {
            // 当第二个index上的value不等于前一个
            if (nums[i] != nums[i - 1]) {
                // 我们把这个值放进nums[fast]
                nums[fast] = nums[i];
                // k指针后移
                fast++;
            }
        }

        return fast;
    }
}