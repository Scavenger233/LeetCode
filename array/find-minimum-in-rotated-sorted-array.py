class Solution:
    def findMin(self, nums: List[int]) -> int:
        l, r = 0, len(nums) - 1
        res = nums[0]

        while l <= r:
            if nums[l] <= nums[r]:
                res = nums[l]
                break
            
            m = (l + r) // 2
            if nums[l] <= nums[m]:
                l = m + 1
            else:
                r = m - 1
            res = min(res, nums[m])

        return res