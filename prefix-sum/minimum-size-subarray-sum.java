class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // double for loop
        int result = Integer.MAX_VALUE; //最后返回值，也就是subarray的长度 or 0
        int subLength = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++ ){
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum >= target) {
                    subLength = j - i + 1;
                    //如果result小于subLength就更新result
                    result = result < subLength ? result : subLength;
                    // 只要满足了subarray的和大于target就跳出loop
                    break;
                }
            }
        }
        // 如果result值没变说明没有符合情况的subarray，返回0；反之则返回新的result值，也就是subarray的长度
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}