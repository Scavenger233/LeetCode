class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int[] sortArr = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        while(left <= right) {
            if(nums[left] < nums[right]) {
                sortArr[index] = nums[right];
                right--;
            } else {
                sortArr[index] = nums[left];
                left++;
            }
            index--;
        }

        int sub = 0;
        int count = 1;
        for(int i = sortArr.length - 1; i >= 0; i--) {
            
            sub += sortArr[i];
            if (sub >= target) {
                return count;
            } else {
                count++;
            }
            
        }

        return 0;
    }
}