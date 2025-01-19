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
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null && cur.next.next != null) {
            // temp在此是临时值，负责该位置的node变更时保留原值
            ListNode temp = cur.next.next.next;
            // first和second都是负责表示node value
            ListNode first = cur.next;
            ListNode second = cur.next.next;
            cur.next = second;
            second.next = first;
            first.next = temp;
            // cur 在此处是指针，负责移动
            cur = first;
        }

        return dummy.next;
    }
}