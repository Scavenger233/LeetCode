class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # 用hash map，从左到右排查符合条件的值
        # 创建preMap so that可以存放value和对应的index 
        # val -> index
        preMap = {}
        # Iterate nums i -> index n -> number
        for i, n in enumerate(nums):
            diff = target - n
            # to check if diff is already in the hash map
            if diff in preMap:
                # diff is the first value in preMap, i is the second
                # Because we put diff in at first, and then find i's value to meet the requirement
                return [preMap[diff], i]
            # put n in index i if not meet the requirement
            preMap[n] = i
        
        return
        