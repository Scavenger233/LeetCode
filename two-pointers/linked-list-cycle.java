/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Two pointers
        // Floyd's Tortios & Hare 
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            // 先移动指针，再进行比较
            fast = fast.next.next;
            slow = slow.next;
            // 移动完再看两个指针是否相等
            if (fast == slow) {
                return true;
            } 
        }

        return false;
    }
}