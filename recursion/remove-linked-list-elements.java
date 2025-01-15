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
        // Set up a virtual head node as dummy
        ListNode dummy = new ListNode();
        // Make the original head the next
        dummy.next = head;

        // Set dummy as cur
        ListNode cur = dummy;

        // Add while check to avoid nullpointer by checking the original head is not empty
        while (cur.next != null) {
            // If the value of the original head equals the the given value
            if (cur.next.val == val) {
                // set the third reference to the second
                cur.next = cur.next.next;
            } else {
                // set the second reference to the first
                cur = cur.next;
            }
        }

        // Return the original head node
        return dummy.next;
    }
}