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
    public ListNode swapPairs(ListNode head) {
        // Third submission, check where you did wrong
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        // cur.next and cur.next.next cannot both be null
        while (cur.next != null && cur.next.next != null) {
            // ListNode first = head; 
            // ListNode second = head.next;
            // This is wrong bc first & second are gong to move, so we use cur
            ListNode first = cur.next;
            ListNode second = cur.next.next;
            ListNode temp = cur.next.next.next;
            cur.next = second;
            second.next = first;
            first.next = temp;
            cur = first;
        }

        return dummy.next;
    }
}