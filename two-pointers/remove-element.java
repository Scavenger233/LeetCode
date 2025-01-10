class Solution {
    public int removeElement(int[] nums, int val) {
        int fast = 0; 
        int slow = nums.length - 1;
        int index = 0;


        for (fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[index] = nums[fast];
                slow++;
                index++;
            } 
        }
        return index;
    }
}