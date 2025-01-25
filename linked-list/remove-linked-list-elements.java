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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        // cursor is on dummynode
        ListNode cur = dummy;

        //check when the node next to the corsor is null
        while (cur.next != null) {
            // move one node forward if it's not equal
            if (cur.next.val != val) {
                cur = cur.next;
                //move the after one step forward if the node needs to be deleted
            } else {
                cur.next = cur.next.next;
            }
        }

        return dummy.next;
    }
}