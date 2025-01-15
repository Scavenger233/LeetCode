# LeetCode

This repository contains my solutions to a diverse array of coding challenges. From tackling intricate algorithms to mastering essential data structures, I’ve dedicated to pushing the boundaries of my capabilities.

Backup by [SyncLeet](https://chromewebstore.google.com/detail/syncleet/maoikpiiondffkjfhjgdcfjklnmadhfk) extension.


# Array
- Elements of an array are contiguous in memory addresses; you cannot delete an element of an array individually, you can only overwrite it.


  - Use a `for` loop to iterate over arrays or when you know the number of iterations.
  - Use a `while` loop when you need to repeat actions based on certain conditions, and these conditions do not depend on the number of iterations or are better suited for dynamically evaluating the end conditions.

## binary search
- Note the handling of boundary values [ , )
- Q 704 [binary-search](https://leetcode.com/problems/binary-search/description/)
- Q 35 [search-insert-position](https://leetcode.com/problems/search-insert-position/description/)
- Q 34 [find-first-and-last-position-of-element-in-sorted-array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/) 边界处理不太明白

## Two pointers
- we have fast pointer to find eligible value, slow pointer to put the value into a new array
- Q 27 [remove-element](https://leetcode.com/problems/remove-element/description/)
- Q 977 [squares-of-a-sorted-array](https://leetcode.com/problems/squares-of-a-sorted-array/description/)
- Q 26 [remove-duplicates-from-sorted-array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/)
- Q 283 [move-zeroes](https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=top-100-liked)

## Sliding window
- To use a for loop with the end of the sub array as the indicator.
- Q 209 [/minimum-size-subarray-sum](https://leetcode.com/problems/minimum-size-subarray-sum/description/)

## Spiral Matrix
- Q 59 [spiral-matrix-ii](https://leetcode.com/problems/spiral-matrix-ii/description/)
- Q 54 [spiral-matrix](https://leetcode.com/problems/spiral-matrix/description/)
