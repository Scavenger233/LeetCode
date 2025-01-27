# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        cur = head
        
        while cur and cur.next and cur.next.next:
            slow, fast = cur, cur
            if slow != fast:
                slow = slow.next
                fast = fast.next.next
            else:
                return True
        
        return False