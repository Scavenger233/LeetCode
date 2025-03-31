class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        l, r = 1, max(piles)
        res = r

        while l <= r:
            k = (l + r) // 2
            totalTime = 0
            for p in piles:
                totalTime += math.ceil(p / k)


            if totalTime <= h:
                res = k # res only updates when total time is smaller than h
                r = k - 1
            else:
                l = k + 1

            

        return res