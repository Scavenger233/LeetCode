class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sqArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sqArr[i] = nums[i] * nums[i];
        }

        int[] sortedSquares = new int[nums.length];

        int left = 0;
        int right = sortedSquares.length - 1;
        int index = sortedSquares.length - 1;

        while (left <= right) {
            if(sqArr[left] > sqArr[right]) {
                sortedSquares[index] = sqArr[left];
                left++;
            } else {
                sortedSquares[index] = sqArr[right];
                right--;
            }
            index--;
        }

        return sortedSquares;


    }
}