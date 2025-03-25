class Solution:
    def findMin(self, nums: List[int]) -> int:
        nums.sort(reverse=False)
        return nums[0]