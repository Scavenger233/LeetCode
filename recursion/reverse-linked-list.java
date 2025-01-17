/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // Recursion
        return reverse(null, head);
    }

    ListNode reverse(ListNode pre, ListNode cur) {
        // In case the original head is null
        if (cur == null) {
            return pre;
        }

        ListNode temp = cur.next;
        cur.next = pre;

        return reverse(cur, temp);
    }
}