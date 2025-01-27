# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        # 这道题不需要cur指针，因为cur指针用在需要调整链表结构的情况下
        # 本题只需要移动指针
        slow, fast = head, head
        
        while fast and fast.next:
            # 进循环需要先移动指针，而不是比较，因为这时slow和fast是相等的
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                return True
        
        return False