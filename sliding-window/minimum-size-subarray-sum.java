class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // double for loop
        int result = Integer.MAX_VALUE;
        int subLength = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++ ){
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[i];

                if (sum >= target) {
                    subLength = j - i + 1;
                    result = result > subLength ? subLength : result;
                    break;
                }
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}