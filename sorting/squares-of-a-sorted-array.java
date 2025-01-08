public class l{
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        Solution s = new Solution();
        int[] ans = s.sortedSquares(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] qsArr = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            qsArr[i] = nums[i] * nums[i];
        }
        int[] sortedArr = new int[nums.length];
        for (int i = 0; i < qsArr.length; i++) {
            int left = 0;
            int right = qsArr.length - 1;
            int index = qsArr.length - 1;

            while (left <= right) {
                if (qsArr[left] > qsArr[right]) {
                    sortedArr[index] = qsArr[left];
                    left++;
                } else {
                    sortedArr[index] = qsArr[right];
                    right--;
                }
                index--;
            }
        }

        return sortedArr;
    }
}