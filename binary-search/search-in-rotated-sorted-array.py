class Solution:
    def search(self, nums: List[int], target: int) -> int:
        res = 0
        for i, n in enumerate(nums):
            if n == target:
                res = i
                return res

        return -1