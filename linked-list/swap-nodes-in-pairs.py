# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head
        cur = dummy

        # 先把value位置换完，在移动cursor位置
        while cur.next and cur.next.next:
            first, second, temp = cur.next, cur.next.next, cur.next.next.next
            cur.next = second
            second.next = first
            first.next = temp
            cur = first

        return dummy.next


        