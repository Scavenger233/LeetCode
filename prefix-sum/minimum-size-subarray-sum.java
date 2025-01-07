class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        //滑动窗口解体思路
        int sum = 0;
        int result = Integer.MAX_VALUE; // result取最大边界值
        int subLength = 0;
        int i = 0;

        // for循环遍历数组，j是sub array的右边界在满足sub array之和大于target的前提下找最小的sub array
        for(int j = 0; j < nums.length; j++) {

            sum += nums[j];

            while (sum >= target) {

                subLength = j - i + 1;
                result = result > subLength ? subLength : result;
                sum = sum - nums[i];
                i++;

            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
