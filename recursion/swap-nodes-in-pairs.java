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

        // 设置虚拟头节点，并指向head
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        // 当dummy节点指向null时，结束循环
        while (cur.next != null && cur.next.next != null) {
            // 设置三个值： temp是3，first是1，second是2
            ListNode temp = cur.next.next.next;
            ListNode first = cur.next;
            ListNode second = cur.next.next;

            // 先让cur指针指向second（也就是把second放在dummy后面）dummy->second
            cur.next = second;
            // 再让second指针指向first dummy->second->first
            second.next = first;
            // 再让first的指针指向temp（aka 3） dummy->second->first->temp(3)
            first.next = temp;
            // 完成一轮swap，把指针移到下一个单元
            cur = first;
        }

        return dummy.next;
        
    }
}