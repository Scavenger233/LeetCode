class Solution:
    def findMin(self, nums: List[int]) -> int:
        l, r = 0, len(nums) - 1
        res = nums[0]

        while l <= r:
            if nums[l] < nums[r]: # There can't be equal, or else it will affect the next judgement
                res = min(res, nums[l])
                break
            
            m = (l + r) // 2
            # the value of res must be assigned before if condition
            res = min(res, nums[m])
            if nums[l] <= nums[m]:
                l = m + 1
            else:
                r = m - 1

        
            

        return res