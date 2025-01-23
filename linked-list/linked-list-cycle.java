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
            if (fast == slow) {
                return true;
            } else {
                fast = fast.next;
                slow = slow.next.next;
            }
        }

        return false;
    }
}